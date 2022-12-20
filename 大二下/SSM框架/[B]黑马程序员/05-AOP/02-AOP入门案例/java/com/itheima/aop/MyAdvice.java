package com.itheima.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component //1.将当前类对象存入spring容器中
@Aspect //2.表示当前类是一个切面(AOP)类
public class MyAdvice {
    // 3.定义切入点表达式
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt() {} //切入点方法,方法体不重要,方法名就是切入点表达式的别名

    // 5.切入点与通知绑定 并在切入点前执行
    @Before("pt()")
    // 4.定义切入点通知
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
