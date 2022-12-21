package com.itheima.service;

import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface AccountService {
    /**
     * 转账操作
     * @param out 传出方
     * @param in 转入方
     * @param money 金额
     */

    // 1.业务层接口上添加Spring事务
    @Transactional //配置当前接口方法具有事务
    public void transfer(String out, String in, Double money) ;
}
