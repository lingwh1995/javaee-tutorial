package org.bluebridge.cache.dao;

import org.bluebridge.cache.domain.Department;

public interface IDepartmentDao {

    /**
     * 根据 id 获取 Department
     * @param id
     * @return
     */
    Department getDeptById(String id);
}
