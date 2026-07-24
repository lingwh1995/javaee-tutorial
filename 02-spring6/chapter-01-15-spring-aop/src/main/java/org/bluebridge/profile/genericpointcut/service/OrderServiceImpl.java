package org.bluebridge.profile.genericpointcut.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * OrderServiceImpl
 *
 * @author lingwh
 * @date 2026/1/10 14:43
 */
public class OrderServiceImpl implements IOrderService {

    private static final Logger logger = LogManager.getLogger(OrderServiceImpl.class);

    @Override
    public void deleteOrderById(String id) {
        logger.info("正在执行删除操作...");
    }
}
