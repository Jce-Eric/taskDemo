package com.example.demo;

/**
 * 单个任务自行调度，在基类自行维护任务状态
 *
 * @param <T> 任务记录表的entity
 */
public abstract class SingleTaskScheduler<T> {
    public abstract void taskMethod(T record);
}
