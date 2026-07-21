package org.bluebridge.datasource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Spring 测试类
 *
 * @author lingwh
 * @date 2026/1/10 10:25
 */
public class SpringTest {

    private static final Logger logger = LogManager.getLogger(SpringTest.class);

    /**
     * 测试 Spring 框架为我们提供的 DataSource 实现
     */
    @Test
    public void testDriverManagerDataSource() throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-datasource.xml");
        DriverManagerDataSource dataSource = applicationContext.getBean("dataSource", DriverManagerDataSource.class);
        Connection connection = dataSource.getConnection();
        logger.info("Spring提供的数据源实现" + connection.toString());
    }
}
