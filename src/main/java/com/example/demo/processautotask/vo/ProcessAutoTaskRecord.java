package com.example.demo.processautotask.vo;

import com.example.demo.task.common.vo.TaskContext;
import lombok.Data;

@Data
public class ProcessAutoTaskRecord extends TaskContext {
    private String processType;

    private String taskType;

    private Integer orderNo;

}
