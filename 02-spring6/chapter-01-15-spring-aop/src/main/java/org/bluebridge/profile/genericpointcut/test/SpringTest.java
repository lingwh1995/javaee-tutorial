package org.bluebridge.profile.genericpointcut.test;

import org.bluebridge.profile.genericpointcut.service.IOrderService;
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
     * 测试配置通用连接点
     */
    @Test
    public void testGenericPointCut() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("profile/genericpointcut/applicationContext-aop-profile-genericpointcut.xml");
        IOrderService orderService = applicationContext.getBean("orderService", IOrderService.class);
        orderService.deleteOrderById("001");
    }
}
