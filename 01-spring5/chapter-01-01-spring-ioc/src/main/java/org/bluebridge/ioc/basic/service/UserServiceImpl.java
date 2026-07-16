package org.bluebridge.ioc.basic.service;

import org.springframework.stereotype.Service;

/**
 * 用户服务实现类
 *
 * @author lingwh
 * @date 2019/3/17 9:42
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    public void sayHello() {
        System.out.println("Hello World!");
    }
}
