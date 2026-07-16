package org.bluebridge.primary.service.impl;

import org.bluebridge.primary.service.IMessageService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * 微信消息发送服务实现类
 *
 * @author lingwh
 * @date 2026/7/13 09:30
 */
@Primary
@Service
public class WechatMessageServiceImpl implements IMessageService {

    @Override
    public String sendMessage(String message) {
        return "this is send wechat message -" + message;
    }
}
