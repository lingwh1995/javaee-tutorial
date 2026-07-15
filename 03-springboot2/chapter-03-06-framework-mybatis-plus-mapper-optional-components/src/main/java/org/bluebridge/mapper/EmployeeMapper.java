package org.bluebridge.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.bluebridge.entity.Employee;
import org.bluebridge.extend.base.MyBaseMapper;

/**
 * 员工Mapper接口
 *
 * @author lingwh
 * @date 2025/2/27 13:28
 */
@Mapper
public interface EmployeeMapper extends MyBaseMapper<Employee> {

}
