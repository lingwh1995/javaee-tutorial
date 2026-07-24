package org.bluebridge;

import org.bluebridge.controller.EmployeeController;
import org.bluebridge.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * MybatisPlus 逆向工程
 *
 * @author lingwh
 * @date 2025/2/27 10:20
 */
@SpringBootTest
public class MybatisPlusMpgTest {

    @Autowired
    private EmployeeController employeeController;

    /**
     * 测试使用 MybatisPlus 的代码生成器生成的代码
     */
    @Test
    public void testMybatisPlusMpg() {
        List<Employee> employeeList = employeeController.getEmployeeList();
        employeeList.forEach(System.out::println);
    }
}