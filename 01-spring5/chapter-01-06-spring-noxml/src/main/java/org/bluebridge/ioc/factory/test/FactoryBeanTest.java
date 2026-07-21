package org.bluebridge.ioc.factory.test;

import org.bluebridge.ioc.factory.domain.ColorFactoryBean;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring 循环依赖
 *
 * @author lingwh
 * @date 2019/4/5 14:47
 */
public class FactoryBeanTest {

    @Test
    public void testFactoryBean() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ColorFactoryBean.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        /**
         * 获取 ColorFactoryBean 所创建的实例
         */
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        // 注意：虽然是通过 colorFactoryBean 这个 id 去获取的，但是获取的是 Color 对象
        Object color1 = context.getBean("colorFactoryBean");
        System.out.println(color1);
        Object color2 = context.getBean("colorFactoryBean");
        System.out.println(color2);

        /**
         * 获取 ColorFactoryBean 本身，在 id 之前加上&
         */
        Object colorFactoryBean = context.getBean("&colorFactoryBean");
        System.out.println(colorFactoryBean);
    }
}
