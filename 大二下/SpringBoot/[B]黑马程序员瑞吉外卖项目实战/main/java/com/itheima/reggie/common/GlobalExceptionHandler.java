package com.itheima.reggie.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 全局异常处理类
 */
@ControllerAdvice(annotations = {RestController.class, Controller.class}) // 拦截指定注解的类
@ResponseBody // 返回json数据
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 拦截SQLIntegrityConstraintViolationException异常
     * @param e 异常
     * @return R
     */
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class) // 拦截指定异常
    public R<String> exceptionHandler(SQLIntegrityConstraintViolationException e) {
        log.error("系统异常: {}", e.getMessage());
        // 判断异常信息中是否包含外键约束
        if (e.getMessage().contains("Duplicate entry")) {
            String[] split = e.getMessage().split(" ");
            return R.error("已存在用户名:" + split[2] + ", 请更换用户名后重新提交");
        }
        return R.error("未知错误, 请联系管理员");
    }
}
