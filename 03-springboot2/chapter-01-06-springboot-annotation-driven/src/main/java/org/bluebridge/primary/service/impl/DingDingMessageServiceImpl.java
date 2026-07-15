package org.bluebridge.primary.service.impl;

import org.bluebridge.primary.service.IMessageService;
import org.springframework.stereotype.Service;

/**
 * 钉钉消息发送服务实现类
 *
 * @author lingwh
 * @date 2026/7/13 09:30
 */
@Service
public class DingDingMessageServiceImpl implements IMessageService {

    @Override
    public String sendMessage(String message) {
        return "this is send dingding message -" + message;
    }
}
