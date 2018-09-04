package com.mydomain.xml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Service;

@Service("timeSpanAspect")
public class TimeSpanAspect {
    public void timeSpan() {
        System.out.println("timeSpan:" + System.currentTimeMillis());
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        before(joinPoint);
        Object result = joinPoint.proceed();
        after(joinPoint);
        return result;
    }

    private void before(ProceedingJoinPoint joinPoint) {
        System.out.println("around before:" + System.currentTimeMillis() + ":" + joinPoint.getSignature().getName());
    }

    private void after(ProceedingJoinPoint joinPoint) {
        System.out.println("around after:" + System.currentTimeMillis() + ":" + joinPoint.getSignature().getName());
    }
}
