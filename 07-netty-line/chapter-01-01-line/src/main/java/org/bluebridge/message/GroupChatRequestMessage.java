package org.bluebridge.message;

import lombok.Data;
import lombok.ToString;

/**
 * 聊天组聊天请求消息
 *
 * @author lingwh
 * @date 2026/7/10 10:58
 */
@Data
@ToString(callSuper = true)
public class GroupChatRequestMessage extends Message {

    private String content;
    private String groupName;
    private String from;

    public GroupChatRequestMessage(String from, String groupName, String content) {
        this.content = content;
        this.groupName = groupName;
        this.from = from;
    }

    @Override
    public int getMessageType() {
        return GroupChatRequestMessage;
    }
}
