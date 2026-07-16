package org.bluebridge.message;

/**
 * Pong响应消息
 *
 * @author lingwh
 * @date 2026/7/10 10:58
 */
public class PongMessage extends Message {

    @Override
    public int getMessageType() {
        return PongMessage;
    }
}
