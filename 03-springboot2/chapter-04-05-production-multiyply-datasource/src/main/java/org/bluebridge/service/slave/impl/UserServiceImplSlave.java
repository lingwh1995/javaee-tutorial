package org.bluebridge.service.slave.impl;

import org.bluebridge.domain.User;
import org.bluebridge.mapper.slave.IUserMapperSlave;
import org.bluebridge.service.slave.IUserServiceSlave;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 从库用户服务实现类
 *
 * @author lingwh
 * @date 2025/11/22 17:27
 */
@Service
public class UserServiceImplSlave implements IUserServiceSlave {

    @Resource
    private IUserMapperSlave userMapperSlave;

    @Override
    public User getUserById(int id) {
        return userMapperSlave.getUserById(id);
    }
}
