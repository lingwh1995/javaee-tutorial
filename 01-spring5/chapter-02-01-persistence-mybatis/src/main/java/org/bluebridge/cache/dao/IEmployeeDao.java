package org.bluebridge.cache.dao;



import org.bluebridge.cache.domain.Employee;

/**
 * 返回结果为 resultMap
 *
 * @author lingwh
 * @date 2019/3/16 19:14
 */
public interface IEmployeeDao {

    /**
     * 根据 id 获取 Employee 对象
     * @param id
     * @return
     */
    Employee getEmployeeById(String id);

    /**
     * 新增 Emp 对象，返回 boolean
     */
    boolean addEmployee(Employee emp);
}
