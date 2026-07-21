package org.bluebridge.ioc.beanlifecycle.domain;

/**
 * Car 实体类，演示 Bean 生命周期
 *
 * @author lingwh
 * @date 2019/4/10 11:17
 */
public class Car {

    public Car() {
        System.out.println("Car constructor......");
    }

    public void init(){
        System.out.println("Car init......");
    }

    public void destory(){
        System.out.println("Car destory......");
    }
}
