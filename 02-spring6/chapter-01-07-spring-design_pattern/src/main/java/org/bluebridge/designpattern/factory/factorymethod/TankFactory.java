package org.bluebridge.designpattern.factory.factorymethod;

/**
 * 坦克工厂
 *
 * @author lingwh
 * @date 2019/4/4 14:41
 */
public class TankFactory extends WeaponFactory{

    @Override
    public Weapon get() {
        return new Tank();
    }
}
