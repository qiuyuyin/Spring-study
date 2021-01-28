package com.yili.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AnnotationPointcut {


    @Pointcut("execution(* com.yili.aop.UserServiceImpl.*(..))")
    public void pointCut() { }
    @After("pointCut()")
    public void after(){
        System.out.println("======方法执行后========");
    }
    @Before("pointCut()")
    public void before(){
        System.out.println("======方法执行前========");
    }
    @Around("pointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("执行环绕方法1");
        Object proceed = pjp.proceed();
        System.out.println("执行环绕方法1");
        return proceed;
    }
}
