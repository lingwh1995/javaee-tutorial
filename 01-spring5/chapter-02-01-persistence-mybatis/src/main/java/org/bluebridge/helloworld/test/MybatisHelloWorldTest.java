package org.bluebridge.helloworld.test;

import org.bluebridge.helloworld.domain.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * 制造大批量数据
 *
 * @author lingwh
 * @date 2019/3/16 20:41
 */
public class MybatisHelloWorldTest {

    private static final String ENV = "mysql";
    /**
     * 1. 根据 xml 配置文件（全局配置文件）创建一个 SqlSessionFactory 对象 有数据源一些运行环境信息
     * 2. sql 映射文件；配置了每一个 sql，以及 sql 的封装规则等。
     * 3. 将 sql 映射文件注册在全局配置文件中
     * 4. 写代码
     *    - 根据全局配置文件得到 SqlSessionFactory
     *    - 使用 sqlSession 工厂，获取到 sqlSession 对象使用他来执行增删改查，一个 sqlSession 就是代表和数据库的一次会话，用完关闭
     *    - 使用 sql 的唯一标志来告诉 MyBatis 执行哪个 sql。sql 都是保存在 sql 映射文件中的。
     *
     * @throws IOException
     */
    private SqlSession getSqlSession() throws IOException {
        // 1. 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream( ENV + "/mybatis-config.xml");
        // 2. 获取 SqlSession 对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory.openSession();
    }

    @Test
    public void fun1() throws IOException {
        SqlSession sqlSession = getSqlSession();
        try{
            Employee employee =  sqlSession.selectOne("emp.getEmployeeById", "1");
            System.out.println(employee);
            sqlSession.commit();
        }catch (Exception e){
            if (sqlSession != null) {
                sqlSession.rollback();
            }
            e.printStackTrace();
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
