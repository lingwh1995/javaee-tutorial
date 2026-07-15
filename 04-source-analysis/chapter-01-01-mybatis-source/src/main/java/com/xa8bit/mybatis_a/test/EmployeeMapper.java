package com.xa8bit.mybatis_a.test;

/**
 * 员工Mapper接口，提供员工查询方法
 *
 * @author lingwh
 * @date 2026/7/13 11:30
 */
public interface EmployeeMapper {

    /**
     * 根据id查询Employee
     *
     * @param id
     * @return
     */
    Employee getEmployeeById(String id);

    /**
     * 根据lastName查询Employee
     *
     * @param lastName
     * @return
     */
    Employee getEmployeeByLastName(String lastName);
}
