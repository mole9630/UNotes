package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.SetmealDto;
import com.itheima.reggie.entity.Setmeal;
import org.springframework.transaction.annotation.Transactional;

public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐, 同时需要保存套餐与菜品的关联关系
     * @param setmealDto 套餐dto
     */
    @Transactional
    void saveWithDish(SetmealDto setmealDto);
}
