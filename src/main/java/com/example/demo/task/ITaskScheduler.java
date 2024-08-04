package com.example.demo.task;

import com.example.demo.task.common.vo.TaskContext;

public interface ITaskScheduler extends ITaskNotify {
    <I, O, T> void execute(TaskContext<I, O> taskContext, ITaskNode taskNode);
}
