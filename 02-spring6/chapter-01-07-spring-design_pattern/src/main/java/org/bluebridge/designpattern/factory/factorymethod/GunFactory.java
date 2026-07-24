package org.bluebridge.designpattern.factory.factorymethod;

/**
 * GunFactory
 *
 * @author lingwh
 * @date 2019/4/4 14:27
 */
public class GunFactory extends WeaponFactory{

    @Override
    public Weapon get() {
        return new Gun();
    }
}
