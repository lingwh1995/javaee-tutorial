package org.bluebridge.profile.advisor.test;

import org.bluebridge.profile.advisor.service.ITeacherService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SpringTest
 *
 * @author lingwh
 * @date 2026/1/10 20:34
 */
public class SpringTest {

    @Test
    public void testAopConfigByXmlUseAdvisor() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("profile/advisor/applicationContext-aop-profile-advisor.xml");
        ITeacherService teacherService = applicationContext.getBean("teacherService", ITeacherService.class);
        teacherService.deleteById("001");
    }
}
