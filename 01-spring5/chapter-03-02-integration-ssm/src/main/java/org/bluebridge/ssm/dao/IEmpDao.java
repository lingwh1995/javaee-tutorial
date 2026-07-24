package org.bluebridge.ssm.dao;


import org.bluebridge.ssm.domain.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * Mybatis 增删改
 *
 * 1. 可以返回以下类型数据：void/Integer/Long/Boolean
 * 2. 不需要在 Mapper 中写返回值类型(resultType)
 */
public interface IEmpDao {
    /**
     * 根据 id 获取对象
     * @param id
     * @return
     */
    Emp getEmployeeById(@Param("id") String id);
}
