package org.bluebridge.annotation.base.choicestatementbean.choicestatement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * OrderInjectByAnnotationComponent
 *
 * @author lingwh
 * @date 2026/1/10 20:34
 */
@Component
public class OrderInjectByAnnotationComponent {

    private static final Logger logger = LogManager.getLogger(OrderInjectByAnnotationComponent.class);

    public OrderInjectByAnnotationComponent() {
        logger.info("被@Component注解标注的类的无参数构造执行了...");
    }
}
