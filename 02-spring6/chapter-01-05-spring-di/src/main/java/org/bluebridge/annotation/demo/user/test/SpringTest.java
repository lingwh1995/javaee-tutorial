package org.bluebridge.annotation.demo.user.test;

import org.bluebridge.annotation.demo.user.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest {

    /**
     * 测试使用 setter 方式为属性注入引用类型的值  给 UserService 中的 userDao 赋值
     * 测试使用构造方式为属性注入引用类型的值     给 UserController 中的 userService 赋值
     */
    @Test
    public void testInjectReferenceBySetterAndConstructor(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation/demo/applicationContext-di-annotation-demo-user.xml");
        UserController userController = applicationContext.getBean("userController", UserController.class);
        userController.deleteUserById("001");
    }
}
