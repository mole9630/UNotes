package com.itheima.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.common.CustomException;
import com.itheima.reggie.dto.SetmealDto;
import com.itheima.reggie.entity.Setmeal;
import com.itheima.reggie.entity.SetmealDish;
import com.itheima.reggie.mapper.SetmealMapper;
import com.itheima.reggie.service.SetmealDishService;
import com.itheima.reggie.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper, Setmeal> implements SetmealService {
    @Autowired
    private SetmealDishService setmealDishService;

    /**
     * 新增套餐, 同时需要保存套餐与菜品的关联关系
     * @param setmealDto 套餐dto
     */
    @Override
    public void saveWithDish(SetmealDto setmealDto) {
        // 保存套餐基本信息, 操作setmeal表, 执行insert语句
        this.save(setmealDto);
        List<SetmealDish> setmealDishes = setmealDto.getSetmealDishes();
        setmealDishes.stream().map((item) -> {
            item.setSetmealId(setmealDto.getId());
            return item;
        }).collect(Collectors.toList());

        // 保存套餐与菜品的关联信息, 操作setmeal_dish表, 执行insert语句
        setmealDishService.saveBatch(setmealDishes);
    }

    /**
     * 删除套餐, 同时需要删除套餐与菜品的关联关系
     * @param ids 套餐id集合
     */
    @Override
    public void removeWithDish(List<Long> ids) {
        // select count(*) from setmeal where id in (1, 2, 3) and status = 1
        // 查询套餐状态, 确定是否可以删除
        LambdaQueryWrapper<Setmeal> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.in(Setmeal::getId, ids);
        queryWrapper.eq(Setmeal::getStatus, 1);
        int count = this.count(queryWrapper);
        if (count > 0) {
            // 如不能删除. 抛出业务异常
            throw new CustomException("套餐正在售卖, 不能删除");
        }

        // 如可以删除, 先删除套餐表中的数据 -setmeal
        this.removeByIds(ids);

        // delete from setmeal_dish where setmeal_id in (1, 2, 3)
        // 再删除套餐表中的数据 -setmeal_dish
        LambdaQueryWrapper<SetmealDish> queryWrapper2 = new LambdaQueryWrapper<>();
        queryWrapper2.in(SetmealDish::getSetmealId, ids);
        setmealDishService.remove(queryWrapper2);
    }
}
