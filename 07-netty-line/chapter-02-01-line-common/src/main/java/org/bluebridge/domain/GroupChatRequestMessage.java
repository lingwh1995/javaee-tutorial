package org.bluebridge.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 群聊请求消息
 *
 * @author lingwh
 * @date 2025/11/2 20:17
 */
@Data
@AllArgsConstructor
public class GroupChatRequestMessage extends AbstractRequestMessage {

    private String groupName;
    private String content;
    private String from;

    @Override
    public int getMessageType() {
        return MessageType.GROUP_CHAT_REQUEST_MESSAGE.getCode();
    }
}
