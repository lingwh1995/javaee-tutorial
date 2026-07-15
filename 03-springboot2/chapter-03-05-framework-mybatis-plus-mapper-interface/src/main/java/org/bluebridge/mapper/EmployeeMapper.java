package org.bluebridge.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.bluebridge.entity.Employee;

/**
 * 员工Mapper接口
 *
 * @author lingwh
 * @date 2025/2/27 11:20
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
