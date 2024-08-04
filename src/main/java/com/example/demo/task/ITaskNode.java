package com.example.demo.task;

import java.util.List;

public interface ITaskNode {
    List<ITask> getTasks();
    ITaskNode getNext();
}
