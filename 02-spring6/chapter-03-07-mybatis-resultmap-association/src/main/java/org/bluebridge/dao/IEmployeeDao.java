package org.bluebridge.dao;

import org.bluebridge.domain.Employee;

/**
 * 员工Dao接口
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public interface IEmployeeDao {

    /**
     * 使用ResultMap的association完成多表一对一查询
     *
     * 根据id获取employee信息和关联的部门信息
     *
     * @param id
     * @return
     */
    Employee getEmployeeAndDepartmentByIdUseAssociation(String id);

    /**
     * 使用ResultMap的association完成多表一对一查询 + 分布查询
     *
     * @param id
     * @return
     */
    Employee getEmployeeAndDepartmentByIdUseAssociationByStep(String id);
}
