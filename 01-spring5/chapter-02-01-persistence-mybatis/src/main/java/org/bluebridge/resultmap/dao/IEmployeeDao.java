package org.bluebridge.resultmap.dao;


import org.bluebridge.resultmap.domain.Employee;

import java.util.List;

/**
 * 返回结果为 resultMap
 *
 * @author lingwh
 * @date 2019/3/16 11:48
 */
public interface IEmployeeDao {

    /**
     * 根据 id 获取 Employee 对象
     * @param id
     * @return
     */
    Employee getEmployeeById(String id);

    /**
     * 根据 id 获取 List<Employee> 对象
     * @param id
     * @return
     */
    List<Employee> getEmployeeListById(String id);

    /**
     * 根据 id 获取 Employee 和 Department 对象(多表联查结果封装到 Javabean 中)
     * 使用属性级联封装
     * @param id
     * @return
     */
    Employee getEmployeeAndDepartmentByIdUseCascade(String id);

    /**
     * 根据 id 获取 Employee 和 Department 对象(多表联查结果封装到 Javabean 中)
     * 使用 Association
     * @param id
     * @return
     */
    Employee getEmployeeAndDepartmentByIdUseAssociation(String id);

    /**
     * 根据 id 获取 Employee 和 Department 对象(多表联查结果封装到 Javabean 中)
     * 使用 Asscoation 进行分步骤查询
     * @param id
     * @return
     */
    Employee getEmployeeAndDepartmentByIdStepUseAssociate(String id);


    /**
     * 根据 id 获取 Employee 和 Department 对象(多表联查结果封装到 Javabean 中)
     * 使用 Asscoation 进行分步骤查询+使用 discriminator(鉴别器)对数据进行处理
     * @param id
     * @return
     */
    Employee getEmployeeAndDepartmentByIdStepUseDiscriminator(String id);
}
