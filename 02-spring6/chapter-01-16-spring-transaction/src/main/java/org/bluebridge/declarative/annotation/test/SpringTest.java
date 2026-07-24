package org.bluebridge.declarative.annotation.test;

import org.bluebridge.declarative.annotation.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring 测试类
 *
 * @author lingwh
 * @date 2026/1/10 14:30
 */
public class SpringTest {

    /**
     * 测试 Spring 声明式事务
     */
    @Test
    public void testTransferDealTransactionByDeclarative() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("declarative/annotation/applicationContext-tx-declarative-annotation.xml");
        IAccountService accountService = applicationContext.getBean("accountService", IAccountService.class);
        accountService.transfer("张三","李四",100);
    }
}
