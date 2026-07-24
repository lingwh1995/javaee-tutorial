package org.bluebridge.dao;

import org.apache.ibatis.annotations.Select;
import org.bluebridge.domain.User;

/**
 * UserDao
 *
 * @author lingwh
 * @date 2019/11/14 10:15
 */
public interface UserDao {

    @Select("select id,username,password from t_user where id =#{id}")
    User getUserById(String id);
}
