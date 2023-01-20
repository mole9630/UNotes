package com.itheima.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.entity.Orders;
import com.itheima.reggie.mapper.OrdersMapper;
import com.itheima.reggie.service.OrdersService;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {
}
