package com.itheima.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.common.CustomException;
import com.itheima.reggie.entity.Category;
import com.itheima.reggie.entity.Dish;
import com.itheima.reggie.entity.Setmeal;
import com.itheima.reggie.mapper.CategoryMapper;
import com.itheima.reggie.service.CategoryService;
import com.itheima.reggie.service.DishService;
import com.itheima.reggie.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setmealService;

    /**
     * 根据ID删除分类, 删除前判断分类是否关联菜品及套餐
     * @param id
     */
    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        // 添加查询条件
        dishLambdaQueryWrapper.eq(Dish::getCategoryId, id);
        int countDish = dishService.count(dishLambdaQueryWrapper);

        // 判断分类是否关联菜品, 如已关联, 抛出业务异常
        if (countDish > 0) {
            throw new CustomException("该分类已关联菜品, 无法删除");
        }

        // 添加查询条件
        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId, id);
        int countSetmeal= setmealService.count(setmealLambdaQueryWrapper);

        // 判断分类是否关联套餐, 如已关联, 抛出业务异常
        if (countSetmeal > 0) {
            throw new CustomException("该分类已关联套餐, 无法删除");
        }

        // 均未关联, 正常删除
        super.removeById(id);
    }
}
