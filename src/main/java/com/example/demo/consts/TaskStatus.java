package com.example.demo.consts;

public enum TaskStatus {
    PENDING,    // 待处理
    RUNNING,    // 进行中
    SUCCESS,    // 成功
    FAILED      // 失败
    ;
    public boolean isSuccess() {
        return this == SUCCESS;
    }
}