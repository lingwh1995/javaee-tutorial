package org.bluebridge.profile.demo.user.service;

import org.bluebridge.profile.demo.user.dao.UserDao;

/**
 * 使用 setter 方式为属性注入引用类型的值
 *
 * @author lingwh
 * @date 2026/1/10 14:35
 */
public class UserServiceImple implements IUserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void deleteUserById(String id) {
        userDao.deleteUserById(id);
    }
}
