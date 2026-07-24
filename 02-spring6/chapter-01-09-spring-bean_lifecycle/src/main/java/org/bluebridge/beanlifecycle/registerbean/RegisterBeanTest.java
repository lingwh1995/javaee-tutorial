package org.bluebridge.beanlifecycle.registerbean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * 把自己通过 new 创建的 Bean 交给 Spring 容器管理
 *
 * @author lingwh
 * @date 2025/5/13 9:37
 */
public class RegisterBeanTest {

    private static final Logger logger = LogManager.getLogger(RegisterBeanTest.class);

    public static void main(String[] args) {
        User user = new User();
        logger.info(user.toString());

        // 1. 创建 DefaultListableBeanFactory
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        // 2. 注册一个单例的 bean 到 Spring 容器中
        factory.registerSingleton("user",user);
        User userFromBeanFactory = factory.getBean("user", User.class);
        logger.info(userFromBeanFactory.toString());
    }
}
