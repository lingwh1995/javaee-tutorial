package org.bluebridge.ioc.hellowrold.config;

import org.bluebridge.ioc.hellowrold.domain.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * Spring 无 XML 配置类
 * 根据 Class 类型来确定哪些类要被 IOC 容器管理
 * @Configuration 中
 * 1. value 配置扫描的包的路径是： org.bluebridge，并且扫描的时候根据注解过滤掉被 @Controller 和 @Service 的 bean，也可以自定义扫描过滤规则
 * 2. includeFilters 是包含过滤器 includeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {PersonDao.class, Person.class})}, useDefaultFilters = false)
 * 3. excludeFilters 是排除过滤器 excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})})
 *
 * @author lingwh
 * @date 2019/4/2 9:16
 */
@Configuration
@ComponentScan(value= "org.bluebridge.ioc.hellowrold",
               excludeFilters = { @ComponentScan.Filter(type = FilterType.ANNOTATION,
               classes = { Controller.class, Service.class })})
public class Config {

    /**
     * 默认约定
     * 1. 默认使用方法名作为 id
     * 2. 默认创建的 bean 是单例的
     *
     * 也可以使用 @Bean 的 name 属性来指定 id
     *
     * @Scope
     * 1. 如果为单例：IOC 容器初始化的过程会实例化 bean
     * 2. 如果为多例：IOC 容器初始化的过程不会实例化 bea
     *
     * @return
     */
    @Scope("prototype")
    @Bean(name="person")
    public Person person(){
        System.out.println("给IOC容器中放值");
        return new Person("0001","zhangsan","29");
    }
}
