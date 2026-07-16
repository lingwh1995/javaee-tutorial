package org.bluebridge.anno.service;

import org.springframework.stereotype.Service;

/**
 * 用户服务实现类
 *
 * @author lingwh
 * @date 2019/3/21 14:35
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    public String eat() {
        //System.out.println(1/0);
        System.out.println("eat...");
        return "eat方法返回值...";
    }
}
