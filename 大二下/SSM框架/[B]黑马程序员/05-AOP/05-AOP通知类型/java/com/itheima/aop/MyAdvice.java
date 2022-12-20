package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    // 3.定义切入点表达式
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt() {
    }

    @Pointcut("execution(int com.itheima.dao.BookDao.select())")
    private void pt2() {
    }

    // 之前
//    @Before("pt()")
    public void before() {
        System.out.println("before advice...");
    }

    // 之后(不管原始方法是否出现异常)
//    @After("pt()")
    public void after() {
        System.out.println("after advice...");
    }

    // 环绕(最常用)
//    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before advice...");

        // 表示对原始操作的调用
        pjp.proceed();

        System.out.println("after advice...");
    }

//    @Around("pt2()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before advice...");

        // 表示对原始操作的调用
        Object ret = pjp.proceed();
//        Integer ret = (Integer) pjp.proceed();

        System.out.println("after advice...");

        // 把原始方法的返回值返回
//        return 200;\
        return ret;
//        return ret + 233;
    }

    // 原始方法执行完成以后运行(原始方法出现异常不运行)
//    @AfterReturning("pt2()")
    public void afterReturning() {
        System.out.println("afterReturning advice...");
    }

    // 原始方法执行完成以后运行(原始方法出现异常运行)
    @AfterThrowing("pt2()")
    public void afterThrowing() {
        System.out.println("afterThrowing advice...");
    }
}
