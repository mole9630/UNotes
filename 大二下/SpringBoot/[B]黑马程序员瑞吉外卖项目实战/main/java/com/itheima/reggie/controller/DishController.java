package com.itheima.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.reggie.common.R;
import com.itheima.reggie.dto.DishDto;
import com.itheima.reggie.entity.Category;
import com.itheima.reggie.entity.Dish;
import com.itheima.reggie.entity.DishFlavor;
import com.itheima.reggie.service.CategoryService;
import com.itheima.reggie.service.DishFlavorService;
import com.itheima.reggie.service.DishService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * 菜品管理
 */
@RestController
@RequestMapping("/dish")
public class DishController {
    @Autowired
    private DishFlavorService dishFlavorService;
    @Autowired
    private DishService dishService;
    @Autowired
    private CategoryService categoryService; // 分类
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 新增菜品
     * @param dishDto 菜品信息
     * @return 是否成功
     */
    @PostMapping
    public R<String> save(@RequestBody DishDto dishDto) {
        dishService.saveWithFlavor(dishDto);
        // 清理菜品缓存
        // 构造redis的key
        String key = "dish_" + dishDto.getCategoryId() + "_1"; // 精确清理某个分类下的菜品缓存
        redisTemplate.delete(key);
        return R.success("添加菜品成功");
    }

    @GetMapping("/page")
    public R<Page> page(int page, int pageSize, String name) {
        // 构造分页构造器
        Page<Dish> pageInfo = new Page<>(page, pageSize);
        Page<DishDto> dishDtoPage = new Page<>(page, pageSize);
        // 构造条件构造器
        LambdaQueryWrapper<Dish> queryWrapper = new LambdaQueryWrapper<>();
        // 添加过滤条件
        queryWrapper.like(StringUtils.isNotEmpty(name),Dish::getName, name);
        // 添加排序条件
        queryWrapper.orderByDesc(Dish::getUpdateTime);
        // 查询
        dishService.page(pageInfo, queryWrapper);
        // 对象拷贝
        BeanUtils.copyProperties(pageInfo, dishDtoPage, "records"); // 不拷贝records属性
        List<Dish> records = pageInfo.getRecords();
        List<DishDto> dishDtoList = records.stream().map((item) -> {
            DishDto dishDto = new DishDto();
            BeanUtils.copyProperties(item, dishDto); // 拷贝属性

            Long categoryId = item.getCategoryId(); // 获取菜品分类ID
            // 根据分类ID查询分类
            Category category = categoryService.getById(categoryId);

            // 检查分类是否为空
            if (category != null) {
                String categoryName = category.getName(); // 获取分类名称
                dishDto.setCategoryName(categoryName); // 设置分类名称
            }
            return dishDto;
        }).collect(Collectors.toList());
        dishDtoPage.setRecords(dishDtoList);

        return R.success(dishDtoPage);
    }

    /**
     * 根据id查询菜品信息及口味信息
     * @param id 菜品id
     * @return 菜品及口味信息
     */
    @GetMapping("/{id}")
    public R<DishDto> get(@PathVariable Long id) {
        DishDto dishDto = dishService.getByIdWithFlavor(id);
        return R.success(dishDto);
    }

    /**
     * 修改菜品信息
     * @param dishDto 菜品信息
     * @return 是否成功
     */
    @PutMapping
    public R<String> update(@RequestBody DishDto dishDto) {
        dishService.updateWithFlavor(dishDto);
        // 清理菜品缓存
        // 构造redis的key
//        Set keys = redisTemplate.keys("dish_*"); // 清理所有菜品缓存
        String key = "dish_" + dishDto.getCategoryId() + "_1"; // 精确清理某个分类下的菜品缓存
        redisTemplate.delete(key);

        return R.success("添加菜品成功");
    }

    /**
     * 根据条件查询对应的菜品数据
     * @param dish 菜品信息
     * @return 菜品数据
     */
//    @GetMapping("/list")
//    public R<List<Dish>> list(Dish dish) {
//        // 构造条件构造器
//        LambdaQueryWrapper<Dish> queryWrapper = new LambdaQueryWrapper<>();
//        // 添加过滤条件
//        queryWrapper.eq(dish.getCategoryId() != null, Dish::getCategoryId, dish.getCategoryId());
//        queryWrapper.eq(dish.getName() != null, Dish::getName, dish.getName());
//        queryWrapper.eq(Dish::getStatus, 1); // 只查询上架的菜品
//        // 添加排序条件
//        queryWrapper.orderByAsc(Dish::getSort).orderByDesc(Dish::getUpdateTime);
//
//        List<Dish> list = dishService.list(queryWrapper);
//        return R.success(list);
//    }
    @GetMapping("/list")
    public R<List<DishDto>> list(Dish dish) {
        List<DishDto> dishDtoList = null;
        // 构造redis的key
        String key = "dish_" + dish.getCategoryId() + "_" + dish.getStatus();

        // 先从redis中获取数据
        dishDtoList = (List<DishDto>) redisTemplate.opsForValue().get(key);

        // 判断是否为空
        if (dishDtoList != null) {
            // 如果存在, 直接返回, 无需查询数据库
            return R.success(dishDtoList);
        }

        // 如果不存在, 查询数据库, 并将数据缓存入redis中
        // 构造条件构造器
        LambdaQueryWrapper<Dish> queryWrapper = new LambdaQueryWrapper<>();
        // 添加过滤条件
        queryWrapper.eq(dish.getCategoryId() != null, Dish::getCategoryId, dish.getCategoryId());
        queryWrapper.eq(dish.getName() != null, Dish::getName, dish.getName());
        queryWrapper.eq(Dish::getStatus, 1); // 只查询上架的菜品
        // 添加排序条件
        queryWrapper.orderByAsc(Dish::getSort).orderByDesc(Dish::getUpdateTime);

        List<Dish> list = dishService.list(queryWrapper);

        dishDtoList = list.stream().map((item) -> {
            DishDto dishDto = new DishDto();
            BeanUtils.copyProperties(item, dishDto); // 拷贝属性

            Long categoryId = item.getCategoryId(); // 获取菜品分类ID
            // 根据分类ID查询分类
            Category category = categoryService.getById(categoryId);

            // 检查分类是否为空
            if (category != null) {
                String categoryName = category.getName(); // 获取分类名称
                dishDto.setCategoryName(categoryName); // 设置分类名称
            }

            // 追加口味数据
            Long dishId = item.getId();// 当前菜品ID
            LambdaQueryWrapper<DishFlavor> queryWrapper2 = new LambdaQueryWrapper<>();
            queryWrapper2.eq(DishFlavor::getDishId, dishId);
            // SQL:select * from dish_flavor where dish_id = ?
            List<DishFlavor> dishFlavorList = dishFlavorService.list(queryWrapper2);// 口味信息集合
            dishDto.setFlavors(dishFlavorList);

            return dishDto;
        }).collect(Collectors.toList());

        // 将查询到的数据缓存入redis中
        redisTemplate.opsForValue().set(key, dishDtoList, 60, TimeUnit.MINUTES);

        return R.success(dishDtoList);
    }
}
