package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {
    //匹配业务层的所有方法
    @Pointcut("execution(* com.itheima.service.*Service.*(..))")
    private void servicePt(){}

    //设置环绕通知, 在原始操作的运行前后记录执行时间
    @Around("ProjectAdvice.servicePt()")
    public Object runSpeed(ProceedingJoinPoint pjp) throws Throwable { //ProceedingJoinPoint是方法信息
        //获取执行的签名对象
        Signature signature = pjp.getSignature(); //一次执行的签名信息(封装了这一次执行过程)
        String className = signature.getDeclaringTypeName(); //获取类名
        String methodName = signature.getName(); //获取方法名
        Object ret = null; //返回值

        long start = System.currentTimeMillis();
        for (int i = 1; i < 10000; i++) { //执行9999次
            ret = pjp.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("万次执行："+ className+"."+methodName+"---->" +(end-start) + "ms");

        return ret;
    }

}
