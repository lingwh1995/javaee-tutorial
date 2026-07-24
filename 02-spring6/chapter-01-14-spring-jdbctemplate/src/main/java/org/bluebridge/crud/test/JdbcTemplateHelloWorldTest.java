package org.bluebridge.crud.test;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * JdbcTemplateHelloWorldTest
 *
 * @author lingwh
 * @date 2019/3/25 11:37
 */
public class JdbcTemplateHelloWorldTest {

    private static final Logger logger = LogManager.getLogger(JdbcTemplateHelloWorldTest.class);

    /**
     * 测试从 Spring 容器中获取 JdbcTemplate 对象
     */
    @Test
    public void testGetJdbcTemplateFromSpring() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        logger.info(jdbcTemplate.toString());
    }
}
