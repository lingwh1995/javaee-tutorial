package org.bulebridge.dao;

import org.bulebridge.domain.User;

/**
 * UserDaoForOracle
 *
 * @author lingwh
 * @date 2023/10/12 09:15
 */
public class UserDaoForOracle implements IUserDao {

    @Override
    public User findUserByUserId(String userId) {
        System.out.println("Oracle执行了根据userId查询功能...");
        // 模拟从数据库中查询到一个 User 对象
        User user = new User("001", "Oracle");
        return user;
    }
}
