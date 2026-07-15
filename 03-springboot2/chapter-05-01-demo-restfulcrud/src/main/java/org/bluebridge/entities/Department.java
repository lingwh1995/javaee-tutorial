package org.bluebridge.entities;

/**
 * 部门实体类
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public class Department {

    private Integer id;

    private String departmentName;

    public Department() {
    }

    public Department(int i, String string) {
        this.id = i;
        this.departmentName = string;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department [id=" + id + ", departmentName=" + departmentName + "]";
    }
}
