package com.example.demo.task;

import com.example.demo.task.common.TaskScheduler;
import com.example.demo.task.common.vo.TaskContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 *
 * @param <T> 任务配置类
 */
@Service
public abstract class ITaskManage<T> {
    @Autowired
    private ITaskConfigLoader<T> taskConfigLoader;

    @Autowired
    private ITaskPipelineFactory<T> taskPipelineFactory;

    @Autowired
    private TaskScheduler taskScheduler;

    // 任务参数，任务类型
    public <I,O> void register(ITaskType taskType, TaskContext<I, O> taskContext) {
        T config = taskConfigLoader.load(taskType);
        ITaskPipeline pipeline = taskPipelineFactory.getPipeline(config, taskType);
        taskScheduler.execute(taskContext, pipeline.getFirstNode());
    }
}
