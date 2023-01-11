package top.mole9630.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// 作为SpringMVC的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {
    // 拦截所有的异常信息
    @ExceptionHandler
    public R handleException(Exception e) {
        // 记录日志
        // 通知运维及开发
        // 返回异常信息
        e.printStackTrace();
        return new R(false, "服务器异常, 请稍后再试");
    }
}
