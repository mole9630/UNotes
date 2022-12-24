package com.itheima.controller;

import com.itheima.exception.BusinessException;
import com.itheima.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e) {
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员,e对象一并发送
        // 返回给前端
        System.out.println("发送异常通知");
        return new Result(e.getCode(), null, e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e) {
        // 返回给前端
        System.out.println("发送异常通知");
        return new Result(e.getCode(), null, e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result doException(Exception e) {
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员,e对象一并发送
        // 返回给前端
        System.out.println("发送异常通知");
        return new Result(Code.SYSTEM_UNKNOWN_ERROR, null, "系统繁忙, 请稍后再试");
    }
}
