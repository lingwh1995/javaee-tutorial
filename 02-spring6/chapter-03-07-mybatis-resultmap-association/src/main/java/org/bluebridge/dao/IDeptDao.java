package org.bluebridge.dao;

import org.bluebridge.domain.Department;

/**
 * 部门 Dao 接口
 *
 * @author lingwh
 * @date 2026/1/10 14:30
 */
public interface IDeptDao {

    /**
     * 根据 deptNo 获取 Department
     *
     * @param deptNo
     * @return
     */
    Department getDeptByDeptNo(String deptNo);
}
