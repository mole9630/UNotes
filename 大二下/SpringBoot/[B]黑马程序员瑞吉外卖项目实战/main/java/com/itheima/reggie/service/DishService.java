package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.DishDto;
import com.itheima.reggie.entity.Dish;
import org.springframework.transaction.annotation.Transactional;

public interface DishService extends IService<Dish> {
    // 新增菜品, 同时插入对应的口味数据, 同时操作两张表:dish, dish_flavor
    @Transactional // 开启事务
    public void saveWithFlavor(DishDto dishDto);

    // 根据id查询菜品及口味信息
    public DishDto getByIdWithFlavor(Long id);

    // 更新菜品信息, 同时更新对应口味信息
    @Transactional // 开启事务
    void updateWithFlavor(DishDto dishDto);
}
