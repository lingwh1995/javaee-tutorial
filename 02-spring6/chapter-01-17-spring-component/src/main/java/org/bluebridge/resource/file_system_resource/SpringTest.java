package org.bluebridge.resource.file_system_resource;

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
     *  测试访问文件系统中的资源
     * @throws IOException
     */
    @Test
    public void testLoadAndReadFileSystemResource() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-resource.xml");
        FileSystemResourceDemo fileSystemResourceDemo = applicationContext.getBean("fileSystemResourceDemo", FileSystemResourceDemo.class);
        String path = "D:\\repository\\workspace\\IDEA\\PERSONAL\\JavaEE2.0\\chapter-01-017-spring-component\\src\\main\\resources\\applicationContext-resource.xml";
        fileSystemResourceDemo.loadAndParseFileSystemResource(path);
    }
}
