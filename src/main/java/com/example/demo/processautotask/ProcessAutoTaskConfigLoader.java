package com.example.demo.processautotask;

import com.example.demo.processautotask.vo.ProcessAutoTaskConfig;
import com.example.demo.task.ITaskConfigLoader;
import com.example.demo.task.ITaskType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class ProcessAutoTaskConfigLoader implements ITaskConfigLoader<List<ProcessAutoTaskConfig>> {

    @Override
    public List<ProcessAutoTaskConfig> load(ITaskType taskType) {
        return List.of();
    }
}
