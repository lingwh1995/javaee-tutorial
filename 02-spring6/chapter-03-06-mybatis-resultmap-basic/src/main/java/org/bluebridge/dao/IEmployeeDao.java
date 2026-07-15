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
     * 使用ResultMap完成单表查询
     *
     * @param id
     * @return
     */
    Employee getEmployeeById(String id);

    /**
     * 使用ResultMap完成多表关联查询
     *
     * @param id
     * @return
     */
    Employee getEmployeeAndDepartmentById(String id);
}
