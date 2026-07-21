package org.bluebridge.ioc.value.test;

import org.bluebridge.ioc.value.config.Config;
import org.bluebridge.ioc.value.domain.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * 零配置搭建 Spring 开发环境测试
 *
 * @author lingwh
 * @date 2019/4/3 14:34
 */
public class ValueTest {

    @Test
    public void testValue() {
        /**
         * 第一种获取配置文件中值的方式，使用 SpringEL 和 @Value 注解配合使用
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);

        /**
         * 第二种获取配置文件中值的方式，使用 Spring 运行环境来获取
         */
        ConfigurableEnvironment environment = context.getEnvironment();
        String school = environment.getProperty("person.school");
        System.out.println(school);
    }

}
