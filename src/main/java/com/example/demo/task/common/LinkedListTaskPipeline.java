package com.example.demo.task.common;

import com.example.demo.consts.TaskNodeCondition;
import com.example.demo.task.ITask;
import com.example.demo.task.ITaskNode;
import com.example.demo.task.ITaskPipeline;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class LinkedListTaskPipeline implements ITaskPipeline {
    private TaskNode head;

    private TaskNode tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(TaskNode taskNode) {
        if (isEmpty()) {
            head = taskNode;
            tail = taskNode;
        } else {
            tail.setNext(taskNode);
            tail = taskNode;
        }
    }

    @Override
    public ITaskNode getFirstNode() {
        return head;
    }

    @Data
    public static class TaskNode implements ITaskNode {

        private List<ITask> tasks;

        private TaskNode next;

        /**
         * 进入当前节点的前置条件
         */
        private TaskNodeCondition taskNodePreCondition;
    }
}
