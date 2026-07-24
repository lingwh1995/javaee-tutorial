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
 * @date 2026/1/10 13:25
 */
public class SpringTest {

    private static final Logger logger = LogManager.getLogger(SpringTest.class);

    /**
     * 测试Spring 示例化 bean的第一种方式： 使用构造方法实例化bean
     */
    @Test
    public void testBeanInstantiationByConstructionMethod() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringBean springBean = applicationContext.getBean("springBean", SpringBean.class);
        logger.info(springBean.toString());
    }
}
