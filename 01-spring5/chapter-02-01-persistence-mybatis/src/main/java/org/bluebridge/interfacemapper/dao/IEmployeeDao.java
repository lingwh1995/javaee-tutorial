package org.bluebridge.interfacemapper.dao;

import org.bluebridge.interfacemapper.domain.Employee;

public interface IEmployeeDao {
    /**
     * 根据 id 获取对象
     * @param id
     * @return
     */
    Employee getEmplyeeById(String id);

    /**
     * 根据 id 获取 lastname
     * @param id
     * @return
     */
    String getEmplyeeLastNameById(String id);
}
