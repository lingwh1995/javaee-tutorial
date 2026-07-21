package org.bluebridge.message;

import lombok.Data;
import lombok.ToString;

/**
 * 退出聊天组响应消息
 *
 * @author lingwh
 * @date 2025/10/16 20:05
 */
@Data
@ToString(callSuper = true)
public class GroupQuitResponseMessage extends AbstractResponseMessage {

    public GroupQuitResponseMessage(boolean success, String reason) {
        super(success, reason);
    }

    @Override
    public int getMessageType() {
        return GroupQuitResponseMessage;
    }
}
