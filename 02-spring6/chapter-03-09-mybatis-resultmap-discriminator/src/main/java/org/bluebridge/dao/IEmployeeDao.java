package org.bluebridge.dao;

import org.bluebridge.domain.Employee;

/**
 * 员工Dao接口
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public interface IEmployeeDao {

    /**
     * 使用ResultMap的Association完成多表关联查询 + 使用discriminator改变封装行为
     *
     * @param id
     * @return
     */
    Employee getEmployeeAndDepartmentByIdUseAssociationDiscriminator(String id);
}
