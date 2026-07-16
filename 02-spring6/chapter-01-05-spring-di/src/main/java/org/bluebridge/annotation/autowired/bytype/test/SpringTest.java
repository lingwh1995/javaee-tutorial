package org.bluebridge.annotation.autowired.bytype.test;

import org.bluebridge.annotation.autowired.bytype.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring测试类
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public class SpringTest {

    /**
     * 测试使用@Autowired完成按类型注入
     */
    @Test
    public void testInjectValueByAutowiredByTypeByAnnotation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation/autowired/applicationContext-di-annotation-autowired-bytype.xml");
        UserController userController = applicationContext.getBean("userController", UserController.class);
        userController.deleteById("001");
    }
}
