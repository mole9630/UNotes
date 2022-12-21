package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DataAdvice {
    @Pointcut("execution(boolean com.itheima.service.*Service.*(*, *))")
    private void servicePt(){}

    @Around("servicePt()")
    public Object trimStr(ProceedingJoinPoint pjp) throws Throwable {
        // 获取参数
        Object[] args = pjp.getArgs();

        // 判断参数是否为字符串
        for (int i=0; i<args.length; i++) {
//            if (args[i] instanceof String) { //方法1
            if (args[i].getClass().equals(String.class)) { //方法2
                args[i] = args[i].toString().trim();
            }
        }

        // 把修改后的参数还给原始方法
        Object ref = pjp.proceed(args);
        return ref;
    }
}
