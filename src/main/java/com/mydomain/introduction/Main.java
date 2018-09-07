package com.mydomain.introduction;

import com.mydomain.manager.TaskManager;
import com.mydomain.manager.TaskManagerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("introductionContext.xml");
        TaskManager taskManager = context.getBean("taskManagerImpl", TaskManagerImpl.class);
        taskManager.start(1L);

        GreetService greetService = (GreetService) taskManager;
        greetService.greeting("Ray");
    }
}
