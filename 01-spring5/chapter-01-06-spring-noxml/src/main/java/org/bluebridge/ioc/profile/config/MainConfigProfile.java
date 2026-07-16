package org.bluebridge.ioc.profile.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import java.beans.PropertyVetoException;
import javax.sql.DataSource;

/**
 * @Profile注解
 *
 * 注解说明
 * @Profile 是 Spring / Spring Boot 用于环境隔离的核心注解，可以根据当前激活的环境，动态加载 / 启用不同 Bean、配置、类、方法。
 * 常用于区分：dev 开发、test 测试、prod 生产、local 本地、uat 预发 等环境。注解的本质是条件注解，不满足环境则该 Bean 不注入容器。
 *
 * 注解位置
 * 1. 类上：整个类、内部所有 Bean 仅在指定环境生效
 * 2. 方法上：仅当前 @Bean 方法在指定环境生效
 *
 * @author lingwh
 * @date 2019/4/2 10:26
 */
@Profile("default")
@PropertySource("classpath:/db.properties")
@Configuration
public class MainConfigProfile implements EmbeddedValueResolverAware {

    @Value("${home.develop.mysql.jdbc.password}")
    private String password;

    private StringValueResolver resolver;

    /**
     * 测试数据源
     *
     * @param username
     * @return
     * @throws PropertyVetoException
     */
    @Profile("test")
    @Bean(name="testDataSource")
    public DataSource dataSourceTest(@Value("${home.develop.mysql.jdbc.username}")String username) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setJdbcUrl("${jdbc:mysql://192.168.1.102:3306/mybatis}");
        String driver = resolver.resolveStringValue("${home.develop.mysql.jdbc.driver}");
        dataSource.setDriverClass(driver);
        return dataSource;
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.resolver = resolver;
    }

    /**
     * 开发数据源
     *
     * @return
     * @throws PropertyVetoException
     */
    @Profile("default")
    @Bean
    public DataSource dataSourceDefault() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setJdbcUrl("jdbc:mysql://192.168.0.38:3306");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        return dataSource;
    }
}
