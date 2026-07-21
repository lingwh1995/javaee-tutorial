package org.bluebridge.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bluebridge.controller.UserController;
import org.bluebridge.domain.User;
import org.dom4j.DocumentException;
import org.junit.Test;
import org.summerframework.core.BeanFactory;
import org.summerframework.core.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * Spring 测试类
 *
 * @author lingwh
 * @date 2026/1/10 10:50
 */
public class SpringTest {

    private Logger logger = LogManager.getLogger(SpringTest.class);

    @Test
    public void testBeanFactory() throws DocumentException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        BeanFactory applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 测试当 property 为简单类型的数据时
        User user = (User) applicationContext.getBean("user");
        logger.info(user.toString());

        // 测试当 property 为引用类型的数据时
        UserController userController = (UserController) applicationContext.getBean("userController");
        userController.deleteUserById("001");
    }
}
