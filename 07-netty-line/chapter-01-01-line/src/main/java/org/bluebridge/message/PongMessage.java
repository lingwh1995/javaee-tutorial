package org.bluebridge.message;

/**
 * Pong响应消息
 *
 * @author lingwh
 * @date 2025/10/16 20:35
 */
public class PongMessage extends Message {

    @Override
    public int getMessageType() {
        return PongMessage;
    }
}
