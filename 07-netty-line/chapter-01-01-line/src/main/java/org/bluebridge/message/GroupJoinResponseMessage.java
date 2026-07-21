package org.bluebridge.message;

import lombok.Data;
import lombok.ToString;

/**
 * 加入聊天组响应消息
 *
 * @author lingwh
 * @date 2025/10/16 19:45
 */
@Data
@ToString(callSuper = true)
public class GroupJoinResponseMessage extends AbstractResponseMessage {

    public GroupJoinResponseMessage(boolean success, String reason) {
        super(success, reason);
    }

    @Override
    public int getMessageType() {
        return GroupJoinResponseMessage;
    }
}
