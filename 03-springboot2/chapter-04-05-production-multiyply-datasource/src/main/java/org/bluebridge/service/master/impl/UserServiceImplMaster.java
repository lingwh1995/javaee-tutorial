package org.bluebridge.service.master.impl;

import org.bluebridge.domain.User;
import org.bluebridge.mapper.master.IUserMapperMaster;
import org.bluebridge.service.master.IUserServiceMaster;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 主库用户服务实现类
 *
 * @author lingwh
 * @date 2025/11/22 17:27
 */
@Service
public class UserServiceImplMaster implements IUserServiceMaster {

    @Resource
    private IUserMapperMaster userMapperMaster;

    @Override
    public User getUserById(int id) {
        return userMapperMaster.getUserById(id);
    }
}
