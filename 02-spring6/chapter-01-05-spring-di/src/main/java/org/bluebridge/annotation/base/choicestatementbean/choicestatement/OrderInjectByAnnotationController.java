package org.bluebridge.annotation.base.choicestatementbean.choicestatement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;

/**
 * OrderInjectByAnnotationController
 *
 * @author lingwh
 * @date 2026/1/10 20:34
 */
@Controller
public class OrderInjectByAnnotationController {

    private static final Logger logger = LogManager.getLogger(OrderInjectByAnnotationController.class);

    public OrderInjectByAnnotationController() {
        logger.info("被@Controller注解标注的类的无参数构造执行了...");
    }
}
