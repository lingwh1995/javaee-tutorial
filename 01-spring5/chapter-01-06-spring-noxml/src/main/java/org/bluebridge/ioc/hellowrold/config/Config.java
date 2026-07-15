package org.bluebridge.ioc.hellowrold.config;

import org.bluebridge.ioc.hellowrold.domain.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * Spring无XML配置类
 * 根据Class类型来确定哪些类要被IOC容器管理
 * @Configuration中
 * 1. value 配置扫描的包的路径是: org.bluebridge，并且扫描的时候根据注解过滤掉被@Controller和@Service的bean，也可以自定义扫描过滤规则
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
     * 1. 默认使用方法名作为id
     * 2. 默认创建的bean是单例的
     *
     * 也可以使用@Bean的name属性来指定id
     *
     * @Scope
     * 1. 如果为单例:IOC容器初始化的过程会实例化bean
     * 2.如果为多例:IOC容器初始化的过程不会实例化bea
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
