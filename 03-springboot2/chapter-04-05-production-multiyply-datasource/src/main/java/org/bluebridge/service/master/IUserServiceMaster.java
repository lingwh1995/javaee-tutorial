package org.bluebridge.service.master;

import org.bluebridge.domain.User;

/**
 * 主库用户服务接口
 *
 * @author lingwh
 */
public interface IUserServiceMaster {

    User getUserById(int id);
}
