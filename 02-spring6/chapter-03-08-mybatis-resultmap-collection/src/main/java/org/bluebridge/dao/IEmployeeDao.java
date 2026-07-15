package org.bluebridge.dao;

import org.bluebridge.domain.Employee;

import java.util.List;

/**
 * 员工Dao接口
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public interface IEmployeeDao {

    /**
     * 根据deptNo查询多个Employee对象
     *
     * @param deptNo
     * @return
     */
    List<Employee> getEmployeesByDeptNo(String deptNo);
}
