package org.bluebridge.message;

/**
 * Ping请求消息
 *
 * @author lingwh
 * @date 2026/7/10 10:58
 */
public class PingMessage extends Message {

    @Override
    public int getMessageType() {
        return PingMessage;
    }
}
