package org.bluebridge.resultmap.test;

import org.bluebridge.resultmap.dao.IEmployeeDao;
import org.bluebridge.resultmap.domain.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 测试 mybatis 接口式编程
 *
 * @author lingwh
 * @date 2019/3/16 11:08
 */
public class IEmployeeResultMapTest {

    /**
     * 获取 SqlSession
     * @return
     * @throws IOException
     */
    public SqlSession getSqlSession() throws IOException{
        // 1. 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("mysql/mybatis-config.xml");
        // 2. 获取 SqlSession 对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 3. 获取 SqlSession 对象
        // 获取可以自动提交的 openSession 对象，传入 true
        // SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 获取需要手动提交的 openSession 对象，传入 fasle 或者什么都不传
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        // SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }

    /**
     * 根据 id 查询使用 resultMap 封装的对象，
     * @throws IOException
     */
    @Test
    public void getEmployeeById() throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        try {
            // 4. 获取接口实现类对象
            IEmployeeDao employeePlusDaoImpl = sqlSession.getMapper(IEmployeeDao.class);
            // 5. 根据 id 获取对象
            Employee employee = employeePlusDaoImpl.getEmployeeById("1");
            System.out.println("employee:"+employee);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 6. 关闭 sqlSession
            sqlSession.close();
        }
    }

    /**
     * 根据 id 查询使用 resultMap 封装的对象，
     * @throws IOException
     */
    @Test
    public void getEmployeeListById() throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        try {
            // 4. 获取接口实现类对象
            IEmployeeDao employeePlusDaoImpl = sqlSession.getMapper(IEmployeeDao.class);
            // 5. 根据 id 获取对象
            List<Employee> employeeList = employeePlusDaoImpl.getEmployeeListById("1");
            System.out.println("employeeList:"+employeeList);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 6. 关闭 sqlSession
            sqlSession.close();
        }
    }

    /**
     * 根据 id 获取 Employee 和 Department 对象(多表联查结果封装到 Javabean 中)
     * 使用属性级联封装
     * @throws IOException
     */
    @Test
    public void getEmployeeAndDepartmentByIdUseCascade() throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        try {
            // 4. 获取接口实现类对象
            IEmployeeDao employeePlusDaoImpl = sqlSession.getMapper(IEmployeeDao.class);
            // 5. 根据 id 获取对象
            Employee employee = employeePlusDaoImpl.getEmployeeAndDepartmentByIdUseCascade("1");
            System.out.println("employee:"+employee);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 6. 关闭 sqlSession
            sqlSession.close();
        }
    }

    /**
     * 根据 id 获取 Employee 和 Department 对象(多表联查结果封装到 Javabean 中)
     * 使用 Assocation
     * @throws IOException
     */
    @Test
    public void getEmployeeAndDepartmentByIdUseAssociation() throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        try {
            // 4. 获取接口实现类对象
            IEmployeeDao employeePlusDaoImpl = sqlSession.getMapper(IEmployeeDao.class);
            // 5. 根据 id 获取对象
            Employee employee = employeePlusDaoImpl.getEmployeeAndDepartmentByIdUseAssociation("1");
            System.out.println("employee:"+employee);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 6. 关闭 sqlSession
            sqlSession.close();
        }
    }

    /**
     * 根据 id 获取 Employee 和 Department 对象(多表联查结果封装到 Javabean 中)
     * 使用 Assocation 进行分步骤查询+使用 Assocation 时可以配置懒加载/延迟加载(基于分步骤查询)
     * @throws IOException
     */
    @Test
    public void getEmployeeAndDepartmentByIdStepUseAssociate() throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        try {
            // 4. 获取接口实现类对象
            IEmployeeDao employeePlusDaoImpl = sqlSession.getMapper(IEmployeeDao.class);
            // 5. 根据 id 获取对象
            Employee employee = employeePlusDaoImpl.getEmployeeAndDepartmentByIdStepUseAssociate("1");
            // 发两条 sql：查询主表数据+查询子表数据
            System.out.println("employee:"+employee);
            // 发两条 sql：查询主表数据+查询子表数据
            System.out.println("employee:"+employee);

            // 懒加载/延迟加载模式：发一条 sql：查询主表数据，因为没有用到从表数据
            System.out.println("employee:"+employee.getEmail());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 6. 关闭 sqlSession
            sqlSession.close();
        }
    }
    /**
     * 根据 id 获取 Employee 和 Department 对象(多表联查结果封装到 Javabean 中)
     * 使用 Assocation 进行分步骤查询+使用 Assocation 时可以配置懒加载/延迟加载(基于分步骤查询)+discriminator 鉴别器
     * @throws IOException
     */
    @Test
    public void getEmployeeAndDepartmentByIdStepUseDiscriminator() throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        try {
            // 4. 获取接口实现类对象
            IEmployeeDao employeePlusDaoImpl = sqlSession.getMapper(IEmployeeDao.class);
            // 5. 根据 id 获取对象
            Employee employee = employeePlusDaoImpl.getEmployeeAndDepartmentByIdStepUseDiscriminator("4");
            // 发两条 sql：查询主表数据+查询子表数据
            System.out.println("employee:"+employee);
            // 发两条 sql：查询主表数据+查询子表数据
            System.out.println("employee:"+employee);

            // 懒加载/延迟加载模式：发一条 sql：查询主表数据，因为没有用到从表数据
            System.out.println("employee:"+employee.getEmail());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 6. 关闭 sqlSession
            sqlSession.close();
        }
    }
}
