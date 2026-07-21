package org.bluebridge.ioc.condition.condition_a.config;

import org.bluebridge.ioc.condition.condition_a.domain.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * 条件装配配置类
 *
 * @Conditional({WindowsConditional.class})
 * 意味着只有当满足 Conditional 的子类的方法中的条件，这个类中所有注册 bean 的方法才会生效
 *
 * @author lingwh
 * @date 2019/4/8 11:23
 */
@Configuration
@ComponentScan(value= "org.bluebridge.ioc.condition",
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
                classes = {Controller.class, Service.class})})
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
    @Conditional({WindowsConditional.class})
    @Scope("prototype")
    @Bean(name="person")
    public Person person(){
        System.out.println("给IOC容器中放值");
        return new Person("0001","zhangsan","29");
    }
}
