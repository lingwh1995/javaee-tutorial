package org.bluebridge.mapper.master;

import org.bluebridge.domain.User;

/**
 * 主库用户Mapper接口
 *
 * @author lingwh
 */
public interface IUserMapperMaster {

    User getUserById(int id);
}
