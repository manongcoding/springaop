package com.mydomain.introduction;

import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.stereotype.Service;

@Service("greetAdvice")
public class GreetAdvice extends DelegatingIntroductionInterceptor implements GreetService {
    @Override
    public void greeting(String name) {
        System.out.println("hello, " + name);
    }
}
