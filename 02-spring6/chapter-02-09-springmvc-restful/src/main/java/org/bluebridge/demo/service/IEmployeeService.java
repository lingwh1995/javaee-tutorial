package org.bluebridge.demo.service;

import org.bluebridge.demo.domain.Employee;

import java.util.Collection;

/**
 * IEmployeeService
 *
 * @author lingwh
 * @date 2025/3/16 09:42
 */
public interface IEmployeeService {
    void addEmployee(Employee employee);

    void deleteEmployeeById(Integer id);

    void updateEmployee(Employee employee);

    Employee getEmployeeById(Integer id);

    Collection<Employee> getAllEmployees();
}
