package org.bluebridge.service;

import org.bluebridge.domain.User;

/**
 * 用户服务接口
 *
 * @author lingwh
 */
public interface IUserService {

    /**
     * 根据id获取User
     * @param id
     * @return
     */
    User getUserById(String id);
}
