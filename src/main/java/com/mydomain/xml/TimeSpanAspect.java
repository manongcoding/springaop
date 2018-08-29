package com.mydomain.xml;

import org.springframework.stereotype.Service;

@Service("timeSpanAspect")
public class TimeSpanAspect {
    public void timeSpan(){
        System.out.println(System.currentTimeMillis());
    }
}
