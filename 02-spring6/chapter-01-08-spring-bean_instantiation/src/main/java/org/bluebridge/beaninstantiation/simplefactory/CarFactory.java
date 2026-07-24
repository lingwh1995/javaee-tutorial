package org.bluebridge.beaninstantiation.simplefactory;

/**
 * Spring 示例化 bean 的第二种方式： 使用简单(静态)工厂实例化 bean
 *
 * @author lingwh
 * @date 2026/1/10 09:30
 */
public class CarFactory {

    /**
     * 简单工厂模式中的获取对象的方法是静态方法
     * @return
     */
    public static Car getCar() {
        // 注意这里这个对象是我们通过 new 手动创建的，如果使用简单工厂模式实例化 bean，这个对象不能通过 Spring 的 IOC 创建
        return new Car();
    }
}
