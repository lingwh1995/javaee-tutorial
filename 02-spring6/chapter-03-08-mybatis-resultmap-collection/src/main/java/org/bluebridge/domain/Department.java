package org.bluebridge.domain;

import java.util.List;

/**
 * 部门实体类
 *
 * @author lingwh
 * @date 2026/1/10 14:30
 */
public class Department {

    private String id;

    private String deptName;

    private String deptNo;

    private List<Employee> employees;

    public Department(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", deptName='" + deptName + '\'' +
                ", deptNo='" + deptNo + '\'' +
                ", employees=" + employees +
                '}';
    }
}
