package com.itheima.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.reggie.common.R;
import com.itheima.reggie.entity.Category;
import com.itheima.reggie.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 分类管理
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 添加分类
     * @param category 分类信息
     * @return R
     */
    @PostMapping()
    public R<String> save(@RequestBody Category category){
        categoryService.save(category);
        return R.success("添加分类成功");
    }

    /**
     * 分页查询
     * @param page 当前页
     * @param pageSize 每页显示条数
     * @return 分页后的数据
     */
    @GetMapping("/page")
    public R<Page> page(int page, int pageSize){
        // 分页构造器
        Page<Category> pageInfo = new Page<>(page, pageSize);
        // 条件构造器
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();
        // 添加排序条件, 根据sort字段排序
        queryWrapper.orderByAsc(Category::getSort);
        // 进行分页查询
        categoryService.page(pageInfo, queryWrapper);
        return R.success(pageInfo);
    }

    /**
     * 根据ID删除分类
     * @param ids 分类ID
     * @return R
     */
    @DeleteMapping()
    public R<String> delete(Long ids) {
//        categoryService.removeById(ids);
        categoryService.remove(ids);
        return R.success("删除分类成功");
    }

    /**
     * 根据ID修改分类信息
     * @param category 分类信息
     * @return R
     */
    @PutMapping()
    public R<String> update(@RequestBody Category category) {
        categoryService.updateById(category);
        return R.success("修改分类成功");
    }

    /**
     * 根据条件查询分类数据
     * @return R 分类列表
     */
    @GetMapping("/list")
    public R<List<Category>> list(Category category){
        // 条件构造器
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();
        // 添加条件
        queryWrapper.eq(category.getId() != null, Category::getId, category.getId());
        queryWrapper.eq(category.getType() != null, Category::getType, category.getType());
        // 添加排序条件, 根据sort字段排序
        queryWrapper.orderByAsc(Category::getSort).orderByDesc(Category::getUpdateTime);
        // 查询
        List<Category> list = categoryService.list(queryWrapper);
        return R.success(list);
    }
}
