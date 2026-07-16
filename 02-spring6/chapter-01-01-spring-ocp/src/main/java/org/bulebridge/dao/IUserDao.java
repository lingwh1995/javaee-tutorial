package org.bulebridge.dao;

import org.bulebridge.domain.User;

/**
 * 用户数据访问接口
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public interface IUserDao {

    User findUserByUserId(String userId);
}
