package org.bluebridge.programmatic.test;

import org.bluebridge.programmatic.service.IAccountService;
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
     * 测试 Spring 编程式事务
     */
    @Test
    public void testTransferDealTransactionByProgrammatic() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("programmatic/applicationContext-tx-programmatic.xml");
        IAccountService accountService = applicationContext.getBean("accountService", IAccountService.class);
        accountService.transfer("张三","李四",100);
    }
}
