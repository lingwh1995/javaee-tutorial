package org.bluebridge.service;

import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Select;
import org.bluebridge.domain.PageEntity;
import org.bluebridge.domain.User;

import java.util.List;

/**
 * 用户服务接口
 *
 * @author lingwh
 */
public interface IUserService {

    /**
     * 查询所有的User对象
     * @return
     */
    List<User> list();

    /**
     * 根据id查询User
     * @param id
     * @return
     */
    User getById(int id);

    /**
     * 分页查询所有的User对象
     * @param pageEntity
     * @return
     */
    PageInfo<User> listPage(PageEntity<User> pageEntity);
}
