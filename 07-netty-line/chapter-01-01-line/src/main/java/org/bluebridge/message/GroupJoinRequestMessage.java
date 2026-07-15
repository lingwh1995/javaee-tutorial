package org.bluebridge.message;

import lombok.Data;
import lombok.ToString;

/**
 * 加入聊天组请求消息
 *
 * @author lingwh
 * @date 2026/7/10 10:58
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
