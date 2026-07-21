package org.bluebridge.test;

import org.bluebridge.domain.Cat;
import org.bluebridge.domain.SpringHelloWorld;
import org.bluebridge.domain.User;
import org.bluebridge.reflect.Person;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring 测试类
 *
 * @author lingwh
 * @date 2026/1/10 09:20
 */
public class SpringTest {

    /**
     * 测试 Spring Helloworld 程序
     */
    @Test
    public void testSpringHelloWorld() {
        // 1. 启动 Spring 容器，并加载所有配置文件，并在容器中根据配置文件创建所有 Bean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-springhelloworld.xml");
        // 2. 根据 Bean 的 id 从容器中获取指定的 Bean
            // 使用强制类型转换处理返回值
        SpringHelloWorld springHelloWorld = (SpringHelloWorld)applicationContext.getBean("springHelloWorld");
        System.out.println(springHelloWorld.getClass());
            // 不使用强制类型转换处理返回值
        SpringHelloWorld springHelloWorld1 = applicationContext.getBean("springHelloWorld", SpringHelloWorld.class);
        System.out.println(springHelloWorld1.getClass());
    }

    /**
     * 测试 Spring 一次性加载多个配置文件
     */
    @Test
    public void testSpringLoadMultipleConfigurationFile() {
        // 1. 启动 Spring 容器，并加载所有配置文件，并在容器中根据配置文件创建所有 Bean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-user.xml","applicationContext-cat.xml");
        // 2. 根据 Bean 的 id 从容器中获取指定的 Bean
        User user = (User)applicationContext.getBean("user");
        System.out.println(user.getClass());
        Cat cat = (Cat)applicationContext.getBean("cat");
        System.out.println(cat.getClass());
    }

    /**
     * 测试 Spring 创建 bean 时调用了无参构造函数
     */
    @Test
    public void testSpringInvokeNoConstructionMethod() {
        // 1. 启动 Spring 容器，并加载所有配置文件，并在容器中根据配置文件创建所有 Bean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-reflect.xml");
        // 2. 根据 Bean 的 id 从容器中获取指定的 Bean
        Person person = (Person)applicationContext.getBean("person");
        System.out.println(person.getClass());
    }

    /**
     * 测试 Spring BeanFactory
     * ApplicationContext 接口的顶级父接口是 BeanFactory 接口，所以 SpringIoC 容器使用了工厂模式
     * SpringIoC 容器实现    XML 解析+工厂模式+反射机制
     */
    @Test
    public void testBeanFactory() {
        // 1. 启动 Spring 容器，并加载所有配置文件，并在容器中根据配置文件创建所有 Bean
        BeanFactory applicationContext = new ClassPathXmlApplicationContext("applicationContext-user.xml");
        // 2. 根据 Bean 的 id 从容器中获取指定的 Bean
        User user = (User)applicationContext.getBean("user");
        System.out.println(user.getClass());
    }
}
