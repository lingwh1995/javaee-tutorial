package org.bluebridge.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * MyBatis 工具类 ThreadLocal 版
 *
 * 1. 可以在 Service 和 Dao 层中通过 threadlocal 获取到同一个 SqlSession 对象
 * 2. 同时也有一个缓存效果，这样有利于资源的节省
 * 3. 这个 threadlocal 中存放的 SqlSession 对象一定要回收，否则会引起内存泄露
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public class SqlSessionUtilThreadLocal {

    private static SqlSessionFactory sqlSessionFactory;

    private SqlSessionUtilThreadLocal() {}

    private static ThreadLocal<SqlSession> local = new ThreadLocal();

    /**
     * 类加载时初始化 sqlSessionFactory 对象
     */
    static {
        try {
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 打开会话
     *
     * @return
     */
    public static SqlSession openSession() {
        SqlSession sqlSession = local.get();
        if (sqlSession == null) {
            // 开启会话并获取会话对象
            sqlSession = sqlSessionFactory.openSession();
            // 将 sqlSession 绑定到当前线程上
            local.set(sqlSession);
        }
        return sqlSession;
    }

    /**
     * 关闭SqlSession对象(从当前线程中移除SqlSession对象。)
     *
     * @param sqlSession
     */
    public static void close(SqlSession sqlSession) {
        if (sqlSession != null) {
            sqlSession.close();
            // 注意移除 SqlSession 对象和当前线程的绑定关系，防止内存泄露
            local.remove();
        }
    }
}
