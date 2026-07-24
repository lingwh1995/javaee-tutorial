package org.bluebridge.beaninstantiation.factorymethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Gun
 *
 * @author lingwh
 * @date 2026/1/10 13:25
 */
public class Gun extends Weapon {

    private static final Logger logger = LogManager.getLogger(Gun.class);

    @Override
    public void attack() {
        logger.info("枪射击子弹...");
    }
}
