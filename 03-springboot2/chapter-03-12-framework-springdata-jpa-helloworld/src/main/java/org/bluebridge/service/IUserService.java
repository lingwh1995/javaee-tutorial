package org.bluebridge.service;

import org.bluebridge.domain.User;

/**
 * 用户服务接口
 *
 * @author lingwh
 */
public interface IUserService {

    User findById(String id);
}
