package com.bluebridge.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * SqlSessionUtil
 *
 * @author lingwh
 * @date 2026/1/10 14:30
 */
public class SqlSessionUtil {

    private static SqlSessionFactory sqlSessionFactory = null; // 默认使用数据库环境对应的 SqlSessionFactory
    private static ThreadLocal<SqlSession> local = new ThreadLocal<>(); // 保证一个线程对应一个 SqlSession

    static {
        try {
            // 获取默认使用数据库环境对应的 SqlSessionFactory 对象
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 私有化构造器，防止创建工具类实例对象
     */
    private SqlSessionUtil() {}

    /**
     * 使用工厂对象开启本线程和数据库的会话
     *
     * @return 与数据库的会话对象
     */
    public static SqlSession openSession() {
        SqlSession sqlSession = local.get(); // 获取当前线程对应的数据库会话对象
        // 如果当前线程没有对应的数据库会话对象，则创建一个会话对象
        if (sqlSession == null) {
            sqlSession = sqlSessionFactory.openSession();
            // 保存本线程对应的数据库会话对象
            // 将 sqlSession 对象绑定到当前线程上。
            local.set(sqlSession);
        }
        return sqlSession;
    }

    /**
     * 关闭会话对象
     * 关闭 SqlSession 对象并从当前线程中移除 SqlSession 对象
     */
    public static void close() {
        SqlSession sqlSession = local.get(); // 获取当前线程对应的数据库会话对象
        // 如果当前线程有相应的数据库会话对象就进行关闭
        if (sqlSession != null) {
            sqlSession.close();
            // 注意移除 SqlSession 对象和当前线程的绑定关系。
            // 因为 Tomcat 服务器支持线程池。也就是说：用过的线程对象 t1，可能下一次还会使用这个 t1 线程。
            local.remove();
        }
    }
}
