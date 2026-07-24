package org.bluebridge.dao;

import org.bluebridge.domain.Employee;

import java.util.List;

/**
 * 员工 Dao 接口
 *
 * @author lingwh
 * @date 2026/1/10 14:30
 */
public interface IEmployeeDao {

    /**
     * 根据 deptNo 查询多个 Employee 对象
     *
     * @param deptNo
     * @return
     */
    List<Employee> getEmployeesByDeptNo(String deptNo);
}
