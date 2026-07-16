package org.bluebridge.ioc.profile.dao;

import org.bluebridge.ioc.profile.domain.User;

/**
 * 用户数据访问层
 *
 * @author lingwh
 * @date 2019/3/19 14:22
 */
public class UserDao {

    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public void say(){
        System.out.println("Hello! My Name Is " + user.getName() + "!");
    }
}
