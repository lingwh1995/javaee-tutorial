package org.bluebridge;

import org.bluebridge.service.ITemplateEnginMailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * 模板引擎邮件发送测试类
 *
 * @author lingwh
 * @date 2019/11/28 13:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TemplateEngineTest {

    @Autowired
    private TemplateEngine templateEngine;

    @Autowired
    private ITemplateEnginMailService templateEnginMailService;

    @Test
    public void sendTemplateMail() {
        // 创建邮件正文
        Context context = new Context();
        context.setVariable("id", "006");
        String emailContent = templateEngine.process("emailTemplate", context);
        // templateEnginMailService.sendHtmlMail("1458687169@qq.com","主题：这是模板邮件",emailContent);
    }
}
