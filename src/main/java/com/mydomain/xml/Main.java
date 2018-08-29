package com.mydomain.xml;

import com.mydomain.manager.TaskManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TaskManager taskManager = context.getBean("taskManager", TaskManager.class);
        taskManager.start(1L);
    }
}
