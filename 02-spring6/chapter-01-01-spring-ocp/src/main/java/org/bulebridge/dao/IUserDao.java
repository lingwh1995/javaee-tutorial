package org.bulebridge.dao;

import org.bulebridge.domain.User;

/**
 * 用户数据访问接口
 *
 * @author lingwh
 * @date 2023/10/12 11:35
 */
public interface IUserDao {

    User findUserByUserId(String userId);
}
