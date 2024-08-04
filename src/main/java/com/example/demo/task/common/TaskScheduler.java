package com.example.demo.task.common;

import com.example.demo.task.ITask;
import com.example.demo.task.ITaskNode;
import com.example.demo.task.ITaskScheduler;
import com.example.demo.task.common.vo.TaskContext;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 *
 */

@Component
public class TaskScheduler implements ITaskScheduler {
    // 任务回调的时候，需要获取到任务管道。

    public <I, O, T> void execute(TaskContext<I, O> taskContext, ITaskNode taskNode) {
        List<ITask> tasks = taskNode.getTasks();
        // 执行任务

    }

    @Override
    public <I, O> void notifyResult(TaskContext<I, O> taskContext, ITask task) {
        // 需要处理分支的问题
        if (taskContext.getStatus() != null && !taskContext.getStatus().isSuccess()) {
            return;
        }
        ITaskNode taskNode = task.getTaskNode();
        ITaskNode next = taskNode.getNext();
        // 依据任务状态
        execute(taskContext, next);
    }
}
