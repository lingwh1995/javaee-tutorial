package org.bluebridge.resource.resource_loader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * ReosurceLoader 的作用实际上即使根据传入参数的不同从而选择不同的 Reosurce 加载器
 *
 * @author lingwh
 * @date 2026/1/10 09:40
 */
public class SpringTest {

    private static final Logger logger = LogManager.getLogger(SpringTest.class);

    /**
     * 测试使用 ReosurceLoader 根据传入路径自动选择实现类
     */
    @Test
    public void testReosurceLoader() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-resource.xml");
        // 当传入的路径带有 classpath 时，ReosurceLoader 会自动选择 ClassPathResource 作为实现类
        Resource classPathResource = applicationContext.getResource("classpath:applicationContext-resource.xml");
        logger.info(classPathResource.getClass().getName());
        // 当传入的路径带有 file 时，ReosurceLoader 会自动选择 FileUrlResource 作为实现类
        Resource fileUrlResource = applicationContext.getResource("file:applicationContext-resource.xml");
        logger.info(fileUrlResource.getClass().getName());
        // 当传入的路径带有 http 时，ReosurceLoader 会自动选择 UrlResource 作为实现类
        Resource urlResource = applicationContext.getResource("http://www.baidu.com");
        logger.info(urlResource.getClass().getName());
    }
}
