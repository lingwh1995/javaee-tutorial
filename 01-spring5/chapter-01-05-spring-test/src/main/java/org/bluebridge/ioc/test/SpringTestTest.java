package org.bluebridge.ioc.test;

import org.bluebridge.ioc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 测试 Spring 提供的测试功能
 *
 * @author lingwh
 * @date 2019/4/1 10:20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTestTest {

    @Resource(name="userService")
    private UserService userService;

    @Test
    public void fun1(){
        userService.sayHello();
    }
}
