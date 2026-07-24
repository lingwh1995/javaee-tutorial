package org.bluebridge.dao;

import org.bluebridge.domain.Employee;

/**
 * 员工 Dao 接口
 *
 * @author lingwh
 * @date 2026/1/10 14:30
 */
public interface IEmployeeDao {

    /**
     * 使用 ResultMap 的 association 完成多表一对一查询
     *
     * 根据 id 获取 employee 信息和关联的部门信息
     *
     * @param id
     * @return
     */
    Employee getEmployeeAndDepartmentByIdUseAssociation(String id);

    /**
     * 使用 ResultMap 的 association 完成多表一对一查询 + 分布查询
     *
     * @param id
     * @return
     */
    Employee getEmployeeAndDepartmentByIdUseAssociationByStep(String id);
}
