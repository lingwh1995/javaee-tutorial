package org.bluebridge.service;

import org.bluebridge.domain.Employee;

import java.util.Collection;

/**
 * IEmployeeService
 *
 * @author lingwh
 * @date 2019/3/16 09:41
 */
public interface IEmployeeService {
    void addEmployee(Employee employee);

    void deleteEmployeeById(Integer id);

    void updateEmployee(Employee employee);

    Employee getEmployeeById(Integer id);

    Collection<Employee> getAllEmployees();
}
