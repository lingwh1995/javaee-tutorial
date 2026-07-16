package org.bluebridge.configuration.service;

import org.bluebridge.configuration.dao.UserDao;
import org.bluebridge.configuration.domain.User;

/**
 * 用户服务实现类
 *
 * @author lingwh
 * @date 2026/7/13 09:30
 */
public class UserServiceImpl implements IUserService {

    private UserDao userDao;

    /**
     * 使用set方式注入
     *
     * @param userDao 用户DAO实例
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
}
