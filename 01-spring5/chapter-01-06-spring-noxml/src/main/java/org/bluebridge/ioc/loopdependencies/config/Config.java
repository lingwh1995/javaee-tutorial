package org.bluebridge.ioc.loopdependencies.config;

import org.bluebridge.ioc.loopdependencies.domain.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * 零配置搭建 Spring 开发环境测试
 *
 * @author lingwh
 * @date 2019/4/4 10:42
 */
@Configuration
@ComponentScan(value= "org.bluebridge.ioc.loopdependencies",
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
                classes = {Controller.class, Service.class})})
public class Config {

    /**
     * 默认
     * 1. 默认使用方法名作为 id
     * 2. 默认创建的 bean 是单例的
     * 也可以使用 @Bean 的 name 属性来指定 id
     *
     * @Scope
     * 如果为单例：IOC 容器初始化的过程会实例化 bean
     * 如果为多例：IOC 容器初始化的过程不会实例化 bea
     * @return
     */
    @Scope("prototype")
    @Bean(name="person")
    public Person person(){
        System.out.println("给IOC容器中放值");
        return new Person("0001","zhangsan","29");
    }
}
