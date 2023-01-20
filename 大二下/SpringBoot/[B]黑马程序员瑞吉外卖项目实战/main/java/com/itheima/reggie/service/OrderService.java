package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Orders;
import org.springframework.transaction.annotation.Transactional;

public interface OrderService extends IService<Orders> {
    /**
     * 用户下单
     * @param orders 订单对象
     */
    @Transactional
    void submit(Orders orders);
}
