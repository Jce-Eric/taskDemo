package com.example.demo.task.common.vo;

import com.example.demo.consts.TaskStatus;
import lombok.Data;

@Data
public class TaskContext<I, O> {
    private I input;

    private O output;

    private TaskStatus status;

    private String message;
}
