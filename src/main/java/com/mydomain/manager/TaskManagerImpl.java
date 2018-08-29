package com.mydomain.manager;

import org.springframework.stereotype.Service;

@Service("taskManager")
public class TaskManagerImpl implements TaskManager {
    /**
     * 启动任务
     *
     * @param id 任务id
     */
    @Override
    public void start(Long id) {
        System.out.println("start the task, id:" + id);
    }

    /**
     * 关闭任务
     *
     * @param id 任务id
     */
    @Override
    public void shutdown(Long id) {
        System.out.println("shutdown the task, id:" + id);
    }
}
