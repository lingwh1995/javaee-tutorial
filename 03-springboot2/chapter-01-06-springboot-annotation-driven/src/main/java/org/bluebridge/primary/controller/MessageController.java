package org.bluebridge.primary.controller;

import org.bluebridge.primary.service.IMessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 消息发送控制器
 *
 * @author lingwh
 * @date 2019/11/19 11:15
 */
@Controller
public class MessageController {

    @Resource
    private IMessageService messageService;

    /**
     * 访问  http://localhost:8080/send-message    查看效果
     *
     * @return 消息发送结果
     */
    @ResponseBody
    @RequestMapping("/send-message")
    public String sendMessage(){
        String message = "hello springboot~";
        return messageService.sendMessage(message);
    }
}
