package org.bluebridge.service;

/**
 * 模板引擎邮件发送接口
 *
 * @author lingwh
 * @date 2019/11/28 13:26
 */
public interface ITemplateEnginMailService {

    /**
     * 发送 html 邮件
     * @param to 邮件接收者
     * @param subject 邮件主题
     * @param content 邮件内容
     */
    void sendHtmlMail(String to, String subject, String content);
}
