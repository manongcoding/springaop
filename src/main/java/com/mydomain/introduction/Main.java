package com.mydomain.introduction;

import com.mydomain.manager.TaskManager;
import com.mydomain.manager.TaskManagerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main
 *
 * @author jyl25609
 * @version Id: Main, v 0.1 18-9-7 下午4:42 jyl25609 Exp $
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("introductionContext.xml");
        TaskManager taskManager = context.getBean("taskManagerImpl", TaskManagerImpl.class);
        taskManager.start(1L);

        GreetService greetService = (GreetService) taskManager;
        greetService.greeting("Ray");
    }
}
