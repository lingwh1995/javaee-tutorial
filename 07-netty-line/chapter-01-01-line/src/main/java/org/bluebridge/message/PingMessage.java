package org.bluebridge.message;

/**
 * Ping请求消息
 *
 * @author lingwh
 * @date 2025/10/16 20:30
 */
public class PingMessage extends Message {

    @Override
    public int getMessageType() {
        return PingMessage;
    }
}
