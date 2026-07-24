package org.bluebridge.beaninstantiation.constructionmethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Spring 示例化 bean的第一种方式： 使用构造方法实例化bean
 *
 * @author lingwh
 * @date 2026/1/10 13:25
 */
public class SpringBean {
    private static final Logger logger = LogManager.getLogger(SpringBean.class);

    public SpringBean() {
        logger.info("springBean的无参构造方法执行了...");
    }
}
