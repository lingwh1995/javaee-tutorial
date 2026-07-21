package org.bluebridge.primary.service.impl;

import org.bluebridge.primary.service.IMessageService;
import org.springframework.stereotype.Service;

/**
 * 邮件消息发送服务实现类
 *
 * @author lingwh
 * @date 2019/11/19 14:22
 */
@Service
public class EmailMessageServiceImpl implements IMessageService {

    @Override
    public String sendMessage(String message) {
        return "this is send email message -" + message;
    }
}
