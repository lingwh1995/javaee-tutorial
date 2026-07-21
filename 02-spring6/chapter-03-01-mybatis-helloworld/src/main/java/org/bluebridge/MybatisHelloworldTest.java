package org.bluebridge;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * Mybatis 入门程序测试
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public class MybatisHelloworldTest {

    private static final String ENV = "mysql";

    @Test
    public void testMybatisHelloWorld() {
        SqlSession sqlSession = null;
        try {
            // 1. 创建 SqlSessionFactoryBuilder 对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            // 2. 创建 SqlSessionFactory 对象
            InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(ENV + "/mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            // 3. 创建 SqlSession 对象
            sqlSession = sqlSessionFactory.openSession();
            // 4. 执行 sql
            int count = sqlSession.insert("emp.insertEmployee"); // 这个"insertEmployee"必须是sql的id
            System.out.println("插入几条数据：" + count);
            // 5. 提交（mybatis 默认采用的事务管理器是 JDBC，默认是不提交的，需要手动提交。）
            sqlSession.commit();
        } catch (Exception e) {
            if (sqlSession != null) {
                sqlSession.rollback();
            }
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                // 6. 关闭资源（只关闭是不会提交的）
                sqlSession.close();
            }
        }
    }
}
