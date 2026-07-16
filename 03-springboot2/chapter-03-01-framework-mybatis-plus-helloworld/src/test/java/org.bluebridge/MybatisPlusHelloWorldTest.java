package org.bluebridge;

import org.bluebridge.domain.Employee;
import org.bluebridge.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * MybatisPlusHelloWorldTest
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
@SpringBootTest
public class MybatisPlusHelloWorldTest {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Employee> userList = employeeMapper.selectList(null);
        userList.forEach(System.out::println);
    }
}