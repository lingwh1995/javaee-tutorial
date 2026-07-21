package org.bluebridge.message;

import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * 查看群成员响应消息
 *
 * @author lingwh
 * @date 2025/10/16 19:55
 */
@Data
@ToString(callSuper = true)
public class GroupMembersResponseMessage extends Message {

    private Set<String> members;

    public GroupMembersResponseMessage(Set<String> members) {
        this.members = members;
    }

    @Override
    public int getMessageType() {
        return GroupMembersResponseMessage;
    }
}
