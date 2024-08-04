package com.example.demo.consts;

/**
 * 任务节点 条件
 */
public enum TaskNodeCondition {
    // 全部成功才往下执行
    ALL_SUCCESS,
    // 全部完成（成功或失败）才往下执行
    ALL_FINISH,
}
