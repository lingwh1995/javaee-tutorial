package org.bluebridge.beaninstantiation.factorybeaninterface;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Tank
 *
 * @author lingwh
 * @date 2026/1/10 13:25
 */
public class Tank extends Weapon {

    private static final Logger logger = LogManager.getLogger(Tank.class);

    @Override
    public void attack() {
        logger.info("坦克发动攻击...");
    }
}
