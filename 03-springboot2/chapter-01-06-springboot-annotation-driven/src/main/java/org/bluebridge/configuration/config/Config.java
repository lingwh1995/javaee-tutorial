package org.bluebridge.configuration.config;

import org.bluebridge.configuration.controller.UserController;
import org.bluebridge.configuration.dao.UserDao;
import org.bluebridge.configuration.service.IUserService;
import org.bluebridge.configuration.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * SpringBoot 注解驱动之注解 + Java 代码 驱动配置
 *
 * 1. 使用@Configuration + @Bean + @Scope 代替 XML 配置
 * 2. @Configuration 介绍
 *      @Configuration 可理解为使用 Spring 框架时的 XML 文件中的<beans/>,一般用来声明配置类，可以使用 @Component 注解替代，不过使用@Configuration 注解声明配置类更加语义
 *      proxyBeanMethods = true  创建单实例对象
 *      proxyBeanMethods = false 不进行检查IOC容器中是否存在，而是简单的调用方法进行创建对象，无法保持单实例
 * 3. @Bean 介绍
 *      @Bean 可理解为使用 Spring 框架时 XML 里面的<bean/> 标签
 *      @Bean 的 name 属性来指定 id，相当于<bean/> 标签的 id 属性
 * 4. @Scope 介绍
 *      @Scope 可理解为使用 Spring 框架时 XML 里面的 <bean scope=""/> 标签中的scope属性
 *      @Scope("singleton")                 唯一 bean 实例，Spring 中的 bean 默认都是单例的。
 *      @Scope("prototype")                 每次请求都会创建一个新的 bean 实例
 *      @Scope("request")                   每一次 HTTP 请求都会产生一个新的 bean，该 bean 仅在当前 HTTP request 内有效
 *      @Scope("session")                   每一个 HTTP Session 会产生一个新的 bean，该 bean 仅在当前 HTTP session 内有效
 *
 * @author lingwh
 * @date 2019/11/19 09:35
 */
@Configuration
public class Config {

    /**
     * 把 DataSource 的实例对象放入到 IOC 容器中...
     *
     * @return DataSource 实例
     */
    @Bean
    public DataSource dataSource() {
        System.out.println("把DataSource的实例对象放入到IOC容器中...");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://47.104.136.240:3306/bhrq");
        dataSource.setUsername("root");
        dataSource.setPassword("BBT_Linux_MYSQL@2021!");
        return dataSource;
    }

    /**
     * 把 JdbcTemplate 的实例对象放入到 IOC 容器中
     *
     * @return JdbcTemplate 实例
     */
    @Bean
    public JdbcTemplate jdbcTemplate() {
        System.out.println("把JdbcTemplate的实例对象放入到IOC容器中...");
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //把 DataSource 实例对象注入到 JdbcTemplate 实例对象中
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    /**
     * 把 UserDao 的实例对象放入到 IOC 容器中
     *
     * @return UserDao 实例
     */
    @Bean
    public UserDao userDao(){
        System.out.println("把UserDao的实例对象放入到IOC容器中...");
        UserDao userDao = new UserDao();
        //把 JdbcTemplate 实例对象注入到 UserDao 实例对象中
        userDao.setJdbcTemplate(jdbcTemplate());
        return userDao;
    }

    /**
     * 把 UserService 的实例对象放入到 IOC 容器中，这里使用到了多态
     *
     * @return IUserService 实例
     */
    @Bean
    public IUserService userService(){
        System.out.println("把UserService的实例对象放入到IOC容器中...");
        UserServiceImpl userService = new UserServiceImpl();
        //把 UserDao 实例对象注入到 IUserService 实例对象中
        userService.setUserDao(userDao());
        return userService;
    }

    /**
     * 把 UserController 的实例对象放入到 IOC 容器中
     *
     * @return UserController 实例
     */
    @Bean
    public UserController userController(){
        System.out.println("把UserController的实例对象放入到IOC容器中...");
        UserController userController = new UserController();
        //把 IUserService 实例对象注入到 UserController 实例对象中
        userController.setUserService(userService());
        return userController;
    }
}
