package org.bluebridge.propgation.test;

import org.bluebridge.propgation.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试 Spring 事务传播行为
 *
 * @author lingwh
 * @date 2026/1/10 14:30
 */
public class SpringTest {

    @Test
    public void testSpringPropgation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("propgation/applicationContext-tx-declarative-annotation.xml");
        IAccountService accountService = applicationContext.getBean("accountService", IAccountService.class);
        accountService.transfer("张三","李四",100);
    }
}
