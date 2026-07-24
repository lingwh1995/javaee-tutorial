package org.bluebridge.resultmap.test;

import org.bluebridge.resultmap.dao.IDept;
import org.bluebridge.resultmap.domain.Department;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * 测试类
 *
 * @author lingwh
 * @date 2019/3/16 13:45
 */
public class IDepartmentResultMapTest {
    /**
     * 获取 SqlSession
     * @return
     * @throws IOException
     */
    public SqlSession getSqlSession() throws IOException{
        // 1.加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("mysql/mybatis-config.xml");
        // 2.获取 SqlSession 对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 3.获取 SqlSession 对象
        // 获取可以自动提交的 openSession 对象，传入 true
        // SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 获取需要手动提交的 openSession 对象，传入 fasle 或者什么都不传
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        // SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }


    /**
     * 根据 id 查询 Department 对象和该对象中的 List<Employee>
     * @throws IOException
     */
    @Test
    public void getDeptAndEmployeesByIdUseCascade() throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        try {
            // 4.获取接口实现类对象
            IDept ideptImpl = sqlSession.getMapper(IDept.class);
            // 5.根据 id 获取对象
            Department department = ideptImpl.getDeptAndEmployeesByIdUseCascade("1");
            System.out.println("department:"+department.getEmps());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 6.关闭 sqlSession
            sqlSession.close();
        }
    }


    /**
     * 根据 id 查询 Department 对象和该对象中的 List<Employee>
     * 分步骤查询
     * @throws IOException
     */
    @Test
    public void getDeptAndEmployeesStepById() throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        try {
            // 4.获取接口实现类对象
            IDept ideptImpl = sqlSession.getMapper(IDept.class);
            // 5.根据 id 获取对象
            Department department = ideptImpl.getDeptAndEmployeesStepById("1");
            // 只发一条 sql
            System.out.println("departmentName:"+department.getDname());
            // 发两条 sql
            System.out.println("department:"+department.getEmps());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 6.关闭 sqlSession
            sqlSession.close();
        }
    }
}
