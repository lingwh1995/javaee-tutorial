package org.bluebridge.resultmap.dao;

import org.bluebridge.resultmap.domain.Department;

/**
 * 返回结果为 IDept
 *
 * @author lingwh
 * @date 2019/3/16 11:48
 */
public interface IDept {
    /**
     * 根据 id 获取 Department
     * @param id
     * @return
     */
    Department getDeptById(String id);

    /**
     * 根据 id 获取 Department 和该对象包含的 List<Employee>(多表联查结果封装到 Javabean 中)
     * 使用 collection 标签
     * @param id
     * @return
     */
    Department getDeptAndEmployeesByIdUseCascade(String id);

    /**
     * 根据 id 获取 Department 和该对象包含的 List<Employee>(多表联查结果封装到 Javabean 中)
     * 使用 collection 标签进行分步骤查询和设置懒加载
     * @param id
     * @return
     */
    Department getDeptAndEmployeesStepById(String id);
}
