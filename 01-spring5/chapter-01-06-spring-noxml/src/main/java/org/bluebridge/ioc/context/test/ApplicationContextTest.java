package org.bluebridge.ioc.context.test;

import org.bluebridge.ioc.context.config.Config;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试 ApplicationContext
 *
 * @author lingwh
 * @date 2019/4/7 8:21
 */
public class ApplicationContextTest {

    @Test
    public void testApplicationContext(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        // 获取 ioc 容器中的所有 bean 的名称
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        // 判断 ioc 容器中时候有 user 这个 bean
        boolean hasBeanUser = context.containsBean("user");
        System.out.println("hasBeanUser = " + hasBeanUser);
    }

}
