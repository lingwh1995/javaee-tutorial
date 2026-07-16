package org.bluebridge.service.slave;

import org.bluebridge.domain.User;

/**
 * 从库用户服务接口
 *
 * @author lingwh
 */
public interface IUserServiceSlave {

    User getUserById(int id);
}
