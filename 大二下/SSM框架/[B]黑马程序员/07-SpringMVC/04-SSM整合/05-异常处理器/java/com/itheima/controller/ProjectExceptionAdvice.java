package com.itheima.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public Result doException(Exception e) {
        System.out.println("发送异常通知");
        return new Result(500, e.getMessage(), "未知错误, 请稍后再试");
    }
}
