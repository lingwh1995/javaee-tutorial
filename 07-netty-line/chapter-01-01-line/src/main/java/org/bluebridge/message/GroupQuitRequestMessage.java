package org.bluebridge.message;

import lombok.Data;
import lombok.ToString;

/**
 * 退出聊天组请求消息
 *
 * @author lingwh
 * @date 2025/10/16 20:10
 */
@Data
@ToString(callSuper = true)
public class GroupQuitRequestMessage extends Message {

    private String groupName;
    private String username;

    public GroupQuitRequestMessage(String username, String groupName) {
        this.groupName = groupName;
        this.username = username;
    }

    @Override
    public int getMessageType() {
        return GroupQuitRequestMessage;
    }
}
