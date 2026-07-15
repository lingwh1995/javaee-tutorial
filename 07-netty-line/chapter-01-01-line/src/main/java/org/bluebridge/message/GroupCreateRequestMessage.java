package org.bluebridge.message;

import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * 创建聊天组请求消息
 *
 * @author lingwh
 * @date 2026/7/10 10:58
 */
@Data
@ToString(callSuper = true)
public class GroupCreateRequestMessage extends Message {

    private String groupName;
    private Set<String> members;

    public GroupCreateRequestMessage(String groupName, Set<String> members) {
        this.groupName = groupName;
        this.members = members;
    }

    @Override
    public int getMessageType() {
        return GroupCreateRequestMessage;
    }
}
