package org.bluebridge.dao;

import org.bluebridge.domain.Department;

/**
 * 部门Dao接口
 *
 * @author lingwh
 * @date 2026/1/10 14:30
 */
public interface IDepartmentDao {

    /**
     * 根据deptNo获取Department
     *
     * @param deptNo
     * @return
     */
    Department getDepartmentByDeptNo(String deptNo);
}
