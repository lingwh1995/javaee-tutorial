package org.bluebridge.beaninstantiation.factorymethod;

/**
 * 枪工厂
 *
 * @author lingwh
 * @date 2026/1/10 13:25
 */
public class GunFactory extends WeaponFactory {

    /**
     * 工厂方法模式中的获取对象的方法是实例方法
     * @return
     */
    @Override
    public Weapon get() {
        // 注意这里这个对象是我们通过 new 手动创建的，如果使用简单工厂模式实例化 bean，这个对象不能通过 Spring 的 IOC 创建
        return new Gun();
    }
}
