package com.itheima.reggie.controller;

import com.itheima.reggie.common.R;
import com.itheima.reggie.entity.Orders;
import com.itheima.reggie.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * 用户下单
     * @param orders 订单对象
     * @return 结果
     */
    @PostMapping("/submit")
    @Transactional
    public R<String> submit(@RequestBody Orders orders) {
        orderService.submit(orders);
        return R.success("订单提交成功");
    }
}
