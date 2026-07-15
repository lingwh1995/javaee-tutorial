package org.bluebridge.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.bluebridge.entity.Employee;

/**
 * 员工Mapper接口
 *
 * @author lingwh
 * @date 2026/7/14 09:17
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
