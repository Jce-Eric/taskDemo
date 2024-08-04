package com.example.demo.processautotask;

import com.example.demo.processautotask.vo.ProcessAutoTaskConfig;
import com.example.demo.task.ITaskPipeline;
import com.example.demo.task.ITaskPipelineFactory;
import com.example.demo.task.ITaskType;

import java.util.List;

public class ProcessAutoTaskPipelineFactory implements ITaskPipelineFactory<List<ProcessAutoTaskConfig>> {

    @Override
    public ITaskPipeline getPipeline(List<ProcessAutoTaskConfig> config, ITaskType taskType) {
        return null;
    }
}
