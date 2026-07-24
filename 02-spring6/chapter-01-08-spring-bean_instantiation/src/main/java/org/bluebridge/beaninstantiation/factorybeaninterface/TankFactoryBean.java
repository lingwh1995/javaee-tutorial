package org.bluebridge.beaninstantiation.factorybeaninterface;

import org.springframework.beans.factory.FactoryBean;

/**
 * 坦克工厂
 *
 * @author lingwh
 * @date 2026/1/10 11:40
 */
public class TankFactoryBean implements FactoryBean<Weapon> {

    @Override
    public Weapon getObject() throws Exception {
        // 注意这里这个对象是我们通过 new 手动创建的，如果使用简单工厂模式实例化 bean，这个对象不能通过 Spring 的 IOC 创建
        return new Tank();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
