package org.bluebridge.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 聊天请求消息
 *
 * @author lingwh
 * @date 2025/10/29 9:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatRequestMessage extends AbstractRequestMessage {

    private String from;
    private String to;
    private String content;

    @Override
    public int getMessageType() {
        return MessageType.CHAT_REQUEST_MESSAGE.getCode();
    }
}
