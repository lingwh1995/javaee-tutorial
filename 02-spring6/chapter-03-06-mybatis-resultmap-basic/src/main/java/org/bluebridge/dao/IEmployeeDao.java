package org.bluebridge.dao;

import org.bluebridge.domain.Employee;

/**
 * 员工 Dao 接口
 *
 * @author lingwh
 * @date 2026/1/10 10:45
 */
public interface IEmployeeDao {

    /**
     * 使用 ResultMap 完成单表查询
     *
     * @param id
     * @return
     */
    Employee getEmployeeById(String id);

    /**
     * 使用 ResultMap 完成多表关联查询
     *
     * @param id
     * @return
     */
    Employee getEmployeeAndDepartmentById(String id);
}
