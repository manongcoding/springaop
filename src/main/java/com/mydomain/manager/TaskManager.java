package com.mydomain.manager;

/**
 * 任务管理器
 */
public interface TaskManager {

    /**
     * 启动任务
     * @param id 任务id
     */
    void start(Long id);


    /**
     * 关闭任务
     * @param id 任务id
     */
    void shutdown(Long id);
}
