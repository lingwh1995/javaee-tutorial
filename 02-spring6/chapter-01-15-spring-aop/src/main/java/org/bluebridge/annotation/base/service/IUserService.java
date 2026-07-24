package org.bluebridge.annotation.base.service;

import org.bluebridge.annotation.base.domain.User;

/**
 * IUserService
 *
 * @author lingwh
 * @date 2019/7/22 14:29
 */
public interface IUserService {

    void addUser(User user);
    int deleteUserById(String id);
    void updateUser(User user);
    User getUserById(String id);
    void login();
}
