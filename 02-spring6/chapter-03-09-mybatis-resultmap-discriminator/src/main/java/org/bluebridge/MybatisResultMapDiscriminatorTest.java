package org.bluebridge;

import org.apache.ibatis.session.SqlSession;
import org.bluebridge.dao.IEmployeeDao;
import org.bluebridge.domain.Employee;
import org.bluebridge.utils.SqlSessionUtil;
import org.junit.Test;

/**
 * Mybatis ResultMap discriminator 测试
 *
 * @author lingwh
 * @date 2026/1/10 14:30
 */
public class MybatisResultMapDiscriminatorTest {

    /**
     * 部门编号不等于 10 时就返回空的部门对象，只有等于 10 时才会封装部分信息到员工信息中
     *
     * 使用 ResultMap 的 Association 完成多表关联查询 + 使用 discriminator 改变封装行为测试
     */
    @Test
    public void getEmployeeAndDepartmentByIdUseAssociationDiscriminatorTest() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionUtil.openSession();
            IEmployeeDao employeeDao = sqlSession.getMapper(IEmployeeDao.class);

            Employee employee = employeeDao.getEmployeeAndDepartmentByIdUseAssociationDiscriminator("2");
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
