package org.bluebridge.ioc.profile.controller;

import org.bluebridge.ioc.profile.service.IUserService;

/**
 * 用户控制器
 *
 * @author lingwh
 * @date 2019/3/19 14:48
 */
public class UserController {

    private IUserService userServiceImpl;

    public void setUserServiceImpl(IUserService userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    public void say(){
        userServiceImpl.say();
    }
}
