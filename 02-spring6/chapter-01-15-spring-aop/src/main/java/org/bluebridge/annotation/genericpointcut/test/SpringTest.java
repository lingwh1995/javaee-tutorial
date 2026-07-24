package org.bluebridge.annotation.genericpointcut.test;

import org.bluebridge.annotation.genericpointcut.service.IOrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SpringTest
 *
 * @author lingwh
 * @date 2026/1/10 14:43
 */
public class SpringTest {

    /**
     * 测试配置通用连接点
     */
    @Test
    public void testGenericPointCut() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation/genericpointcut/applicationContext-aop-annotation-genericpointcut.xml");
        IOrderService orderService = applicationContext.getBean("orderService", IOrderService.class);
        orderService.deleteOrderById("001");
    }
}
