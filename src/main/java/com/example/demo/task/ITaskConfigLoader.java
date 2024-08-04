package com.example.demo.task;

/**
 *
 * @param <T> 任务配置类的类型
 */
public interface ITaskConfigLoader<T> {
    T load(ITaskType taskType);
}
