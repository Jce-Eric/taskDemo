package com.example.demo.task;

import com.example.demo.task.common.vo.TaskContext;

public interface ITask {
    void setTaskNode(ITaskNode taskNode);

    ITaskNode getTaskNode();

    <I, O> void run(TaskContext<I, O> taskContext);

    void setNotify(ITaskNotify taskNotify);
}
