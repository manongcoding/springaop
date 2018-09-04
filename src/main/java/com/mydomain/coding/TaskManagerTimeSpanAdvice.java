package com.mydomain.coding;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;

@Service("taskManagerTimeSpanAdvice")
public class TaskManagerTimeSpanAdvice implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("before:" + System.currentTimeMillis());
    }


    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("afterReturning:" + System.currentTimeMillis());
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        before();
        Object obj = invocation.proceed();
        after();
        return obj;
    }

    private void before(){
        System.out.println("MethodInterceptor before:" + System.currentTimeMillis());
    }

    private void after(){
        System.out.println("MethodInterceptor after:" + System.currentTimeMillis());
    }
}
