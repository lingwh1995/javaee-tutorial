package org.bluebridge.dao;

import org.bluebridge.domain.Department;

/**
 * 部门Dao接口
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public interface IDeptDao {

    /**
     * 根据deptNo获取Department
     *
     * @param deptNo
     * @return
     */
    Department getDeptByDeptNo(String deptNo);
}
