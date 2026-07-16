package org.bluebridge.flowable;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * SendRejectionMail
 *
 * @author lingwh
 * @date 2025/11/2 0:28
 */
public class SendRejectionMail implements JavaDelegate {

    /**
     * 这是一个Flowable中的触发器
     *
     * @param execution
     */
    @Override
    public void execute(DelegateExecution execution) {
        // 触发器执行的逻辑 按照我们在流程中的定义 应该给被拒绝的员工发送通知邮件
        System.out.println("不好意思，你的请假申请被拒绝了.....");
    }
}
