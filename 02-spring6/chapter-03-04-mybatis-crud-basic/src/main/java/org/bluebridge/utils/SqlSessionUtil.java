package org.bluebridge.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * MyBatis工具类
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public class SqlSessionUtil {

    private static SqlSessionFactory sqlSessionFactory;

    private SqlSessionUtil() {}

    /**
     * 类加载时初始化sqlSessionFactory对象
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
     * 开启SqlSession
     *
     * @return
     */
    public static SqlSession openSession() {
        return sqlSessionFactory.openSession();
    }
}
