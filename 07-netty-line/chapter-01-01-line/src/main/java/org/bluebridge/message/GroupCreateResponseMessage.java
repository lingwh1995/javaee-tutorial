package org.bluebridge.message;

import lombok.Data;
import lombok.ToString;

/**
 * 创建聊天组响应消息
 *
 * @author lingwh
 * @date 2025/10/16 19:35
 */
@Data
@ToString(callSuper = true)
public class GroupCreateResponseMessage extends AbstractResponseMessage {

    public GroupCreateResponseMessage(boolean success, String reason) {
        super(success, reason);
    }

    @Override
    public int getMessageType() {
        return GroupCreateResponseMessage;
    }
}
