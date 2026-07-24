package org.bluebridge.profile.autowire.bytype.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bluebridge.profile.autowire.byname.service.IOrderService;
import org.bluebridge.profile.autowire.byname.service.OrderServiceImpl;
import org.bluebridge.profile.autowire.bytype.service.IPersonService;
import org.bluebridge.profile.autowire.bytype.service.PersonServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring测试类
 *
 * @author lingwh
 * @date 2023/12/14 10:46
 */
public class SpringTest {

    private static final Logger logger = LogManager.getLogger(SpringTest.class);

    /**
     * 测试使用 setter 方式为属性注入非引用数据类型的值
     */
    @Test
    public void testInjectValueByAutowiredByTypeBySetter(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("profile/autowired/applicationContext-di-profile-autowired-bytype.xml");
        IPersonService personService = applicationContext.getBean("personService", PersonServiceImpl.class);
        personService.deleteById("001");
    }
}
