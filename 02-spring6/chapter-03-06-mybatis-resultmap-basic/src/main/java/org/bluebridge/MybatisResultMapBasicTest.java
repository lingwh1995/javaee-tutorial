package org.bluebridge;

import org.apache.ibatis.session.SqlSession;
import org.bluebridge.dao.IEmployeeDao;
import org.bluebridge.domain.Employee;
import org.bluebridge.utils.SqlSessionUtil;
import org.junit.Test;

/**
 * Mybatis ResultMap 基础测试
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public class MybatisResultMapBasicTest {

    /**
     * 使用ResultMap完成单表查询
     */
    @Test
    public void getEmployeeById() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionUtil.openSession();
            IEmployeeDao employeeDao = sqlSession.getMapper(IEmployeeDao.class);

            Employee employee = employeeDao.getEmployeeById("1");
            System.out.println("employee:"+employee);

            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            sqlSession.close();
        }
    }

    /**
     * 使用ResultMap完成多表关联查询
     */
    @Test
    public void getEmployeeAndDepartmentById() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionUtil.openSession();
            IEmployeeDao employeeDao = sqlSession.getMapper(IEmployeeDao.class);

            Employee employee = employeeDao.getEmployeeAndDepartmentById("1");
            System.out.println("employee:"+employee);

            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            sqlSession.close();
        }
    }
}
