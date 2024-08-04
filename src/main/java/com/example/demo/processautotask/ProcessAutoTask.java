package com.example.demo.processautotask;

import com.example.demo.SingleTaskScheduler;
import com.example.demo.processautotask.vo.ProcessAutoTaskRecord;
import com.example.demo.task.ITask;
import com.example.demo.task.ITaskNotify;

//
public abstract class ProcessAutoTask extends SingleTaskScheduler<ProcessAutoTaskRecord>
        implements ITask {

    protected ITaskNotify taskNotify;

    @Override
    public void taskMethod(ProcessAutoTaskRecord record) {
        run(record);
    }

    public void callback(ProcessAutoTaskRecord record) {
        taskNotify.notifyResult(record, this);
    }

    public void setTaskNotify(ITaskNotify taskNotify) {
        this.taskNotify = taskNotify;
    }
}
