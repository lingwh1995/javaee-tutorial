package org.bluebridge;

import org.bluebridge.handler.MqttMessageReceiverHandler;
import org.bluebridge.handler.MqttMessageSenderHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * 客户端
 *
 * @author lingwh
 * @date 2026/7/13 15:53
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Client {

    /**
     * mqtt消息提供者
     */
    @Resource
    private MqttMessageSenderHandler mqttMessageProvider;

    /**
     * mqtt消息消费者
     */
    @Resource
    private MqttMessageReceiverHandler mqttMessageConsumer;

    @Test
    public void sendMessage() {
        mqttMessageProvider.sendMessage("hello mqtt! I am springboot!", "test/hello-topic");
    }
}
