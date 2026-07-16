package org.bluebridge.ioc.service;

import org.springframework.stereotype.Service;

/**
 * 用户服务实现类
 *
 * @author lingwh
 * @date 2019/4/1 10:18
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    public void sayHello() {
        System.out.println("Hello World!");
    }
}
