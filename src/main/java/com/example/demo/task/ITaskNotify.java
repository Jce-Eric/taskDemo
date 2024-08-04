package com.example.demo.task;

import com.example.demo.task.common.vo.TaskContext;

public interface ITaskNotify {
    <I, O> void notifyResult(TaskContext<I, O> taskContext, ITask task);
}
