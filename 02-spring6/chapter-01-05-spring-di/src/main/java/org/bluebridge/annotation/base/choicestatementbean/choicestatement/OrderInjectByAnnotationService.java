package org.bluebridge.annotation.base.choicestatementbean.choicestatement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * OrderInjectByAnnotationService
 *
 * @author lingwh
 * @date 2026/1/10 20:34
 */
@Service
public class OrderInjectByAnnotationService {

    private static final Logger logger = LogManager.getLogger(OrderInjectByAnnotationService.class);

    public OrderInjectByAnnotationService() {
        logger.info("被@Service注解标注的类的无参数构造执行了...");
    }
}
