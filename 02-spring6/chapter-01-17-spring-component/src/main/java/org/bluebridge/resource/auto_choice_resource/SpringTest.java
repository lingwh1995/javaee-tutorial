package org.bluebridge.resource.auto_choice_resource;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Spring 测试类
 *
 * @author lingwh
 * @date 2026/1/10 10:40
 */
public class SpringTest {

    /**
     * 测试在 IoC 容器中根据配置的 Resouce 类型的属性的 value 的值的前缀自动注入一个 Resource 接口的实现类
     */
    @Test
    public void testAutoChoiceResourceBySpringIoC() throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-auto_choice_resource.xml");
        // 让 Spring 容器根据
        AutoChoiceResourceBySpringIoC autoChoiceResourceBySpringIoC = applicationContext.getBean("autoChoiceResourceBySpringIoC", AutoChoiceResourceBySpringIoC.class);
        autoChoiceResourceBySpringIoC.parseResource();
    }
}
