package org.bluebridge;

import org.apache.ibatis.session.SqlSession;
import org.bluebridge.dao.IDeptDao;
import org.bluebridge.domain.Department;
import org.bluebridge.utils.SqlSessionUtil;
import org.junit.Test;

/**
 * 部门查询测试
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public class IDepartmentTest {

    /**
     * 根据 id 获取 Department
     */
    @Test
    public void getDeptByIdTest() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionUtil.openSession();
            IDeptDao deptDao = sqlSession.getMapper(IDeptDao.class);

            Department dept = deptDao.getDeptByDeptNo("10");
            System.out.println("dept:"+dept);

            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            sqlSession.close();
        }
    }
}
