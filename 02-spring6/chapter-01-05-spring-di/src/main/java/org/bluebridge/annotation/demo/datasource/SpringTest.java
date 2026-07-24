package org.bluebridge.annotation.demo.datasource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * Spring测试类
 *
 * @author lingwh
 * @date 2026/1/10 14:45
 */
public class SpringTest {

    /**
     * 测试 set 方式注入经典应用场景，把数据库配置从硬编码中提取到 Spring 配置文件中
     * @throws SQLException
     */
    @Test
    public void testMyDataSource() throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation/demo/applicationContext-di-annotation-demo-datasource.xml");
        MyDataSource1 myDataSource1 = applicationContext.getBean("myDataSource1", MyDataSource1.class);
        myDataSource1.getConnection();
    }
}
