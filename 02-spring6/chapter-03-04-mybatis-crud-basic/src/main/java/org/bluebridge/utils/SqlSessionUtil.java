package org.bluebridge.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * MyBatis 工具类
 *
 * @author lingwh
 * @date 2026/1/10 14:30
 */
public class SqlSessionUtil {

    private static SqlSessionFactory sqlSessionFactory;

    private SqlSessionUtil() {}

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
     * 开启 SqlSession
     *
     * @return
     */
    public static SqlSession openSession() {
        return sqlSessionFactory.openSession();
    }
}
