package org.bluebridge.noxml.base.test;

import org.bluebridge.noxml.base.config.SpringConfig;
import org.bluebridge.noxml.base.controller.TeacherController;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring 测试类
 *
 * @author lingwh
 * @date 2026/1/10 14:47
 */
public class SpringTest {

    /**
     * 测试 Spring 的全注解开发
     */
    @Test
    public void testNoXml() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        TeacherController teacherController = applicationContext.getBean("teacherController", TeacherController.class);
        teacherController.deleteById("001");
    }
}
