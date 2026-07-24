package org.bluebridge.cache.dao;

import org.bluebridge.cache.domain.Department;

/**
 * IDepartmentDao
 *
 * @author lingwh
 * @date 2019/3/16 19:21
 */
public interface IDepartmentDao {

    /**
     * 根据 id 获取 Department
     * @param id
     * @return
     */
    Department getDeptById(String id);
}
