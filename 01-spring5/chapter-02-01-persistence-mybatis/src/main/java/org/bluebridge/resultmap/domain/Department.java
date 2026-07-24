package org.bluebridge.resultmap.domain;

import java.util.List;

/**
 * Department
 *
 * @author lingwh
 * @date 2019/3/16 11:48
 */
public class Department {
    private String id;
    private String dname;
    private List<Employee> emps;

    public Department(){

    }

    public Department(String id, String dname) {
        this.id = id;
        this.dname = dname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", dname='" + dname + '\'' +
                ", emps=" + emps +
                '}';
    }
}
