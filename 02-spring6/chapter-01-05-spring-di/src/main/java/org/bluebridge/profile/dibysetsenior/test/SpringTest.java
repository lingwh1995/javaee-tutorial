package org.bluebridge.profile.dibysetsenior.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bluebridge.profile.dibysetsenior.inject.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * set 方式注入专题测试类
 *
 * @author lingwh
 * @date 2026/1/10 11:10
 */
public class SpringTest {

    private static final Logger logger = LogManager.getLogger(SpringTest.class);

    /**
     * set 方式注入专题之注入     数组
     */
    @Test
    public void testInjectArrayBySetter(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("profile/dibysetsenior/applicationContext-di-profile-set-senior.xml");
        UserInjectArrayBySetter user = applicationContext.getBean("userInjectArrayBySetter", UserInjectArrayBySetter.class);
        logger.info(user.toString());
    }

    /**
     * set 方式注入专题之注入     List 集合
     */
    @Test
    public void testInjectListBySetter(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("profile/dibysetsenior/applicationContext-di-profile-set-senior.xml");
        UserInjectListBySetter user = applicationContext.getBean("userInjectListBySetter", UserInjectListBySetter.class);
        logger.info(user.toString());
    }

    /**
     * set 方式注入专题之注入     Set 集合
     */
    @Test
    public void testInjectSetBySetter(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("profile/dibysetsenior/applicationContext-di-profile-set-senior.xml");
        UserInjectSetBySetter user = applicationContext.getBean("userInjectSetBySetter", UserInjectSetBySetter.class);
        logger.info(user.toString());
    }

    /**
     * set 方式注入专题之注入     Map 集合
     */
    @Test
    public void testInjectMapBySetter(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("profile/dibysetsenior/applicationContext-di-profile-set-senior.xml");
        UserInjectMapBySetter user = applicationContext.getBean("userInjectMapBySetter", UserInjectMapBySetter.class);
        logger.info(user.toString());
    }

    /**
     * set 方式注入专题之注入     Properties
     */
    @Test
    public void testInjectPropertiesBySetter(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("profile/dibysetsenior/applicationContext-di-profile-set-senior.xml");
        UserInjectPropertiesBySetter user = applicationContext.getBean("userInjectPropertiesBySetter", UserInjectPropertiesBySetter.class);
        logger.info(user.toString());
    }

    /**
     * set 方式注入专题之注入     NULL 和空字符串
     */
    @Test
    public void testInjectNULLAndEmptyStringBySetter(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("profile/dibysetsenior/applicationContext-di-profile-set-senior.xml");
        UserInjectNULLAndEmptyStringBySetter user = applicationContext.getBean("userInjectNULLAndEmptyStringBySetter", UserInjectNULLAndEmptyStringBySetter.class);
        logger.info(user.toString());
        // 测试注入的是 NULL 还是 null 字符串，如果是注入的是 NULL 会报空指针异常(放开代码执行会报异常)
        // user.getId().toString();
        // 测试注入的是空字符串，如果是注入的是空字符串不会报错
        logger.info("-----------------------");
        logger.info(user.getAge().toString());
        logger.info("-----------------------");
    }

    /**
     * set 方式注入专题之注入     特殊符号 < > ' " &
     */
    @Test
    public void testInjectSpecialsymbolsBySetter(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("profile/dibysetsenior/applicationContext-di-profile-set-senior.xml");
        MathInjectSpecialsymbolsBySetter math = applicationContext.getBean("mathInjectSpecialsymbolsBySetter", MathInjectSpecialsymbolsBySetter.class);
        logger.info(math.toString());
    }
}
