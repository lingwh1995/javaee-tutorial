package org.bluebridge.beaninstantiation.constructionmethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring测试类
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public class SpringTest {

    private static final Logger logger = LogManager.getLogger(SpringTest.class);

    /**
     * 测试Spring示例化bean的第一种方式： 使用构造方法实例化bean
     */
    @Test
    public void testBeanInstantiationByConstructionMethod() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringBean springBean = applicationContext.getBean("springBean", SpringBean.class);
        logger.info(springBean.toString());
    }
}
