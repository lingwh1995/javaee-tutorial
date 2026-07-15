package org.bluebridge.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.bluebridge.entity.Employee;
import org.bluebridge.mapper.EmployeeMapper;
import org.bluebridge.service.IEmployeeService;
import org.springframework.stereotype.Service;

/**
 * 员工服务实现类
 *
 * @author lingwh
 * @date 2025/2/27 14:30
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
