package com.mydomain.coding;


import com.mydomain.manager.TaskManager;
import com.mydomain.manager.TaskManagerImpl;
import org.springframework.aop.framework.ProxyFactory;

public class Main {
    public static void main(String[] args) {

        TaskManagerTimeSpanAdvice advice = new TaskManagerTimeSpanAdvice();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new TaskManagerImpl());
        proxyFactory.addAdvice(advice);
        proxyFactory.adviceIncluded(advice);
        TaskManager taskManager = (TaskManager)proxyFactory.getProxy();
        taskManager.start(1L);

    }
}
