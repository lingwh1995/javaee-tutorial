package org.bluebridge.mapper.slave;

import org.bluebridge.domain.User;

/**
 * 从库用户Mapper接口
 *
 * @author lingwh
 */
public interface IUserMapperSlave {

    User getUserById(int id);
}
