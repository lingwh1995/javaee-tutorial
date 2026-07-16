package org.bluebridge.resource.class_path_resource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Spring测试类
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public class SpringTest {

    /**
     *  测试访问类路径资源
     * @throws IOException
     */
    @Test
    public void testLoadAndReadClassPathResource() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-resource.xml");
        ClassPathResourceDemo classPathResourceDemo = applicationContext.getBean("classPathResourceDemo", ClassPathResourceDemo.class);
        String path = "applicationContext-resource.xml";
        classPathResourceDemo.loadAndParseClassPathResource(path);
    }
}
