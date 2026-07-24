package org.bluebridge.dao;

import org.bluebridge.domain.Employee;

/**
 * 员工 Dao 接口
 *
 * @author lingwh
 * @date 2026/1/10 14:30
 */
public interface IEmployeeDao {

    /**
     * 使用 ResultMap 的 Association 完成多表关联查询 + 使用 discriminator 改变封装行为
     *
     * @param id
     * @return
     */
    Employee getEmployeeAndDepartmentByIdUseAssociationDiscriminator(String id);
}
