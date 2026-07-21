package org.bluebridge.ioc.beanlifecycle.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Dog 实体类，演示 Bean 生命周期
 *
 * @author lingwh
 * @date 2019/4/10 11:22
 */
public class Dog {

    public Dog() {
        System.out.println("Dog Constructor......");
    }

    @PostConstruct
    public void init(){
        System.out.println("Dog init......");
    }

    @PreDestroy
    public void destory(){
        System.out.println("Dog destory......");
    }
}
