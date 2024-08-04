package com.example.demo.task;


public interface ITaskPipelineFactory<T> {
    ITaskPipeline getPipeline(T config, ITaskType taskType);
}
