package org.bulebridge.service;

import org.bulebridge.domain.User;

/**
 * 用户服务接口
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public interface IUserService {

    User findUserByUserId(String userId);
}
