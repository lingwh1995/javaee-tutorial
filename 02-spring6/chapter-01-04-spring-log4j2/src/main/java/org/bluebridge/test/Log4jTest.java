package org.bluebridge.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bluebridge.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Log4j2 日志测试类
 *
 * @author lingwh
 * @date 2026/1/10 09:35
 */
public class Log4jTest {

    private static final  Logger logger = LogManager.getLogger(Log4jTest.class);

    /**
     * 测试 Spring 整合 log4j2
     *
     * 直接运行，控制台就已经可以出现 debug 级别的日志了
     */
    @Test
    public void testSpringLog4j2() {
        // 1. 启动 Spring 容器，并加载所有配置文件，并在容器中根据配置文件创建所有 Bean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 根据 Bean 的 id 从容器中获取指定的 Bean
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user.getClass());
    }

    /**
     * 测试在 Spring 项目中使用 log4j2 记录日志
     *  直接运行，控制台就已经可以出现 debug 级别的日志了
     */
    @Test
    public void testApplicationUseLog4j2() {
        logger.info("我是info级别的日志消息......");
        logger.debug("我是debug级别的日志消息......");
        logger.error("我是error级别的日志消息......");
    }
}
