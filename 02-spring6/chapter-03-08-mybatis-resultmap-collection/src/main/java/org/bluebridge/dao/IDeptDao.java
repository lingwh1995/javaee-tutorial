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
     * 使用 ResultMap 的 Collecion 完成多表一对多关联查询
     *
     * 根据 id 获取 Department 信息和该部门所有员工信息
     *
     * @param id
     * @return
     */
    Department getDeptAndEmployeesByDeptIdUseCollection(String id);

    /**
     * 使用 ResultMap 的 Collecion 完成多表一对多关联查询 + 分步查询
     *
     * 根据 id 获取 Department 信息和该部门所有员工信息
     *
     * @param id
     * @return
     */
    Department getDeptAndEmployeesByDeptIdUseCollectionByStep(String id);
}
