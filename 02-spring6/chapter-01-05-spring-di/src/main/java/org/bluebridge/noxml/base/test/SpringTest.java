package org.bluebridge.noxml.base.test;

import org.bluebridge.noxml.base.config.SpringConfig;
import org.bluebridge.noxml.base.controller.TeacherController;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring测试类
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public class SpringTest {

    /**
     * 测试Spring的全注解开发
     */
    @Test
    public void testNoXml() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        TeacherController teacherController = applicationContext.getBean("teacherController", TeacherController.class);
        teacherController.deleteById("001");
    }
}
