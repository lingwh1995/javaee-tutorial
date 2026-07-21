package org.bluebridge.resource.spring_ioc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * 测试 Spring 的 IoC 容器将自身的引用赋值给 ResourceLoaderAware 的实现类中的 ResourceLoader 类型的属性
 *
 * @author lingwh
 * @date 2026/1/10 09:10
 */
public class SpringTest {

    private static final Logger logger = LogManager.getLogger(SpringTest.class);

    @Test
    public void testSpringIocContainerAsResourceLoader() {
        // Spring 的 IoC 容器的实例
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-resource_aware.xml");
        // 从 Spring 的 IoC 容器中共获取 ResourceLoaderAware 的实现类
        SpringIocContainerAsResourceLoader springIocContainerAsResourceLoader = applicationContext.getBean("springIocContainerAsResourceLoader", SpringIocContainerAsResourceLoader.class);
        // 获取 ResourceLoaderAware 的实现类中的 ResourceLoader 类型的属性的值
        ResourceLoader resourceLoader = springIocContainerAsResourceLoader.getResourceLoader();
        logger.info(String.valueOf(applicationContext == resourceLoader));

        // 使用 ResourceLoaderAware 的实现类中的 ResourceLoader 加载文件
        // 当传入的路径带有 classpath 时，ReosurceLoader 会自动选择 ClassPathResource 作为实现类
        Resource classPathResource = resourceLoader.getResource("classpath:applicationContext-resource.xml");
        logger.info(classPathResource.getClass().getName());
        // 当传入的路径带有 file 时，ReosurceLoader 会自动选择 FileUrlResource 作为实现类
        Resource fileUrlResource = resourceLoader.getResource("file:applicationContext-resource.xml");
        logger.info(fileUrlResource.getClass().getName());
        // 当传入的路径带有 http 时，ReosurceLoader 会自动选择 UrlResource 作为实现类
        Resource urlResource = resourceLoader.getResource("http://www.baidu.com");
        logger.info(urlResource.getClass().getName());
    }
}
