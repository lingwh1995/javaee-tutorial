package org.bluebridge.ioc.autowiredlocation.controller;

import org.bluebridge.ioc.autowiredlocation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 用户控制器类
 *
 * @author lingwh
 * @date 2019/4/11 10:37
 */
@Controller
public class UserController {

    /**
     * 测试 @Autowired 写在字段上
     */
    @Autowired
    private UserService userService;

    public void say(){
        userService.say();
    }
}
