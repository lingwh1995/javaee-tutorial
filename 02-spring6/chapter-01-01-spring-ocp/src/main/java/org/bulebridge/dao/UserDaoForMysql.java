package org.bulebridge.dao;

import org.bulebridge.domain.User;

/**
 * UserDaoForMysql
 *
 * @author lingwh
 * @date 2023/10/12 10:25
 */
public class UserDaoForMysql implements IUserDao {

    @Override
    public User findUserByUserId(String userId) {
        System.out.println("Mysql执行了根据userId查询功能...");
        // 模拟从数据库中查询到一个 User 对象
        User user = new User("001", "Mysql");
        return user;
    }
}
