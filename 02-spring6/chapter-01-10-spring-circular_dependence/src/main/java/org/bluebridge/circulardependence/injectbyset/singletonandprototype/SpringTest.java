package org.bluebridge.circulardependence.injectbyset.singletonandprototype;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring 测试类
 *
 * @author lingwh
 * @date 2026/1/10 14:05
 */
public class SpringTest {

    private static final Logger logger = LogManager.getLogger(SpringTest.class);

    /**
     * 测试 singleton + prototype + setter 模式
     *
     * 结论：不会出现循环依赖问题
     */
    @Test
    public void testSingletonAndPrototypeScopeAndSetterCircularDependence() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("injectbyset/applicationContext-singletonandprototype.xml");
        Wife wife = applicationContext.getBean("wife", Wife.class);
        logger.info(wife.toString());
        Husband husband = applicationContext.getBean("husband", Husband.class);
        logger.info(husband.toString());
    }
}
