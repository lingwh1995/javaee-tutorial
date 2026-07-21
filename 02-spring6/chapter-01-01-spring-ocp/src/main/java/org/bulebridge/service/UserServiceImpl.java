package org.bulebridge.service;

import org.bulebridge.dao.IUserDao;
import org.bulebridge.dao.UserDaoForOracle;
import org.bulebridge.domain.User;

/**
 * 用户服务实现类
 *
 * @author lingwh
 * @date 2023/10/12 13:45
 */
public class UserServiceImpl implements IUserService {

    /**
     * 1.0 版本应用采用 Mysql 数据库进行开发带来的问题?
     * 当 2.0 版本应用需要将数据库修改为 Oracle 数据库的时候，要修改现有代码，然后再进行大规模单元测试
     */
    //private IUserDao userDao = new UserDaoForMysql();

    // 模拟 2.0 版本应用将数据库由 Mysql 切换为 Oracle
    private IUserDao userDao = new UserDaoForOracle();

    @Override
    public User findUserByUserId(String userId) {
        return userDao.findUserByUserId(userId);
    }
}
