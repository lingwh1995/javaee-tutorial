package org.bluebridge;

import org.apache.ibatis.session.SqlSession;
import org.bluebridge.utils.SqlSessionUtil;
import org.junit.Test;

/**
 * SqlSession 工具类测试
 *
 * @author lingwh
 * @date 2026/1/10 14:30
 */
public class SqlSessionUtilTest {

    @Test
    public void testMybatisHelloWorld() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionUtil.openSession();
            int count = sqlSession.insert("emp.insertEmployee"); // 这个"insertCar"必须是 sql 的 id
            System.out.println("插入几条数据：" + count);
            sqlSession.commit();
        } catch (Exception e) {
            if (sqlSession != null) {
                sqlSession.rollback();
            }
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

}
