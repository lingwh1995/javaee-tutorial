package org.bluebridge.annotation.base.statementbean.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bluebridge.annotation.base.statementbean.statement.UserInjectByAnnotationComponent;
import org.bluebridge.annotation.base.statementbean.statement.UserInjectByAnnotationController;
import org.bluebridge.annotation.base.statementbean.statement.UserInjectByAnnotationRepository;
import org.bluebridge.annotation.base.statementbean.statement.UserInjectByAnnotationService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring 测试类
 *
 * @author lingwh
 * @date 2026/1/10 14:39
 */
public class SpringTest {

    private static final Logger logger = LogManager.getLogger(SpringTest.class);

    /**
     * 测试使用注解方式为属性注入非引用数据类型的值，使用@Component 注解注入
     */
    @Test
    public void testInjectByAnnotationComponent() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation/base/applicationContext-di-base-statementbean.xml");
        UserInjectByAnnotationComponent user = applicationContext.getBean("userInjectByAnnotationComponent", UserInjectByAnnotationComponent.class);
        logger.info(user.toString());
    }

    /**
     * 测试使用注解方式为属性注入非引用数据类型的值，使用@Repository 注解注入
     */
    @Test
    public void testInjectByAnnotationRepository() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation/base/applicationContext-di-base-statementbean.xml");
        UserInjectByAnnotationRepository user = applicationContext.getBean("userInjectByAnnotationRepository", UserInjectByAnnotationRepository.class);
        logger.info(user.toString());
    }

    /**
     * 测试使用注解方式为属性注入非引用数据类型的值，使用@Service 注解注入
     */
    @Test
    public void testInjectByAnnotationService() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation/base/applicationContext-di-base-statementbean.xml");
        UserInjectByAnnotationService user = applicationContext.getBean("userInjectByAnnotationService", UserInjectByAnnotationService.class);
        logger.info(user.toString());
    }

    /**
     * 测试使用注解方式为属性注入非引用数据类型的值，使用@Controller 注解注入
     */
    @Test
    public void testInjectByAnnotationController() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation/base/applicationContext-di-base-statementbean.xml");
        UserInjectByAnnotationController user = applicationContext.getBean("userInjectByAnnotationController", UserInjectByAnnotationController.class);
        logger.info(user.toString());
    }
}
