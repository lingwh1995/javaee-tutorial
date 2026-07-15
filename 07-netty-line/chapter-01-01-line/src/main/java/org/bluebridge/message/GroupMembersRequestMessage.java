package org.bluebridge.message;

import lombok.Data;
import lombok.ToString;

/**
 * 查看群成员请求消息
 *
 * @author lingwh
 * @date 2026/7/10 10:58
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
