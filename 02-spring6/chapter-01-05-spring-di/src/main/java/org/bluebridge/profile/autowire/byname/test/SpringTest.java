package org.bluebridge.profile.autowire.byname.test;

import org.bluebridge.profile.autowire.byname.service.IOrderService;
import org.bluebridge.profile.autowire.byname.service.OrderServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring测试类
 *
 * @author lingwh
 * @date 2026/1/10 10:28
 */
public class SpringTest {

    private static final Logger logger = LogManager.getLogger(SpringTest.class);

    /**
     * 测试使用 setter 方式为属性注入非引用数据类型的值
     */
    @Test
    public void testInjectValueByAutowiredByNameBySetter(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("profile/autowired/applicationContext-di-profile-autowired-byname.xml");
        IOrderService orderService = applicationContext.getBean("orderService", OrderServiceImpl.class);
        orderService.deleteById("001");
    }
}
