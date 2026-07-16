package com.xa8bit.mybatis_a.test;

import com.xa8bit.mybatis_a.sqlsession.SqlSessioFactory;
import com.xa8bit.mybatis_a.sqlsession.SqlSession;

import java.util.List;

/**
 * MyBatis功能测试类
 *
 * @author lingwh
 * @date 2026/7/13 10:15
 */
public class MybatisTest {

    public static void main(String[] args) {
        SqlSessioFactory sqlSessioFactory = new SqlSessioFactory();
        SqlSession sqlSession = sqlSessioFactory.openSession();
        System.out.println("-------------------------------------------------");
        System.out.println("获取到的sqlSession对象:"+sqlSession);
        System.out.println("-------------------------------------------------");
        List<Employee> employees = sqlSession.selectList("mybatis_a.test.EmployeeMapper.selectList", new Object[]{1});
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("-------------------------------------------------");
        // 获取EmployeeMapper接口的代理对象
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.getEmployeeById("4");
        System.out.println(employee);
    }
}
