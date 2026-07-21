package org.bluebridge.message;

import lombok.Data;
import lombok.ToString;

/**
 * 加入聊天组请求消息
 *
 * @author lingwh
 * @date 2025/10/16 19:40
 */
@Data
@ToString(callSuper = true)
public class GroupJoinRequestMessage extends Message {

    private String groupName;
    private String username;

    public GroupJoinRequestMessage(String username, String groupName) {
        this.groupName = groupName;
        this.username = username;
    }

    @Override
    public int getMessageType() {
        return GroupJoinRequestMessage;
    }
}
