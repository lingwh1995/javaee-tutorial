package org.bulebridge.service;

import org.bulebridge.domain.User;

/**
 * 用户服务接口
 *
 * @author lingwh
 * @date 2023/10/12 14:55
 */
public interface IUserService {

    User findUserByUserId(String userId);
}
