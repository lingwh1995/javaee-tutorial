package org.bulebridge.service;

import org.bulebridge.dao.IUserDao;
import org.bulebridge.dao.UserDaoForOracle;
import org.bulebridge.domain.User;

/**
 * 用户服务实现类
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public class UserServiceImpl implements IUserService {

    /**
     * 1.0 版本应用采用 Mysql 数据库进行开发带来的问题?
     * 当 2.0 版本应用需要将数据库修改为Oracle数据库的时候,要修改现有代码，然后再进行大规模单元测试
     */
    //private IUserDao userDao = new UserDaoForMysql();

    // 模拟2.0 版本应用将数据库由Mysql切换为Oracle
    private IUserDao userDao = new UserDaoForOracle();

    @Override
    public User findUserByUserId(String userId) {
        return userDao.findUserByUserId(userId);
    }
}
