package org.bluebridge.message;

import lombok.Data;
import lombok.ToString;

/**
 * 抽象响应消息
 *
 * @author lingwh
 * @date 2026/7/10 10:58
 */
@Data
@ToString(callSuper = true)
public abstract class AbstractResponseMessage extends Message {

    private boolean success;
    private String reason;

    public AbstractResponseMessage() {
    }

    public AbstractResponseMessage(boolean success, String reason) {
        this.success = success;
        this.reason = reason;
    }
}
