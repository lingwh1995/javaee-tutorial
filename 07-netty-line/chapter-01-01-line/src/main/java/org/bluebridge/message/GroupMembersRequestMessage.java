package org.bluebridge.message;

import lombok.Data;
import lombok.ToString;

/**
 * 查看群成员请求消息
 *
 * @author lingwh
 * @date 2025/10/16 19:50
 */
@Data
@ToString(callSuper = true)
public class GroupMembersRequestMessage extends Message {

    private String groupName;

    public GroupMembersRequestMessage(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public int getMessageType() {
        return GroupMembersRequestMessage;
    }
}
