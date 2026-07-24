package org.bluebridge.builtinparam.dao;


import org.bluebridge.builtinparam.domain.Emp;

import java.util.List;

/**
 * Mybatis 两个内置参数
 *
 * @author lingwh
 * @date 2019/3/16 14:08
 */
public interface IEmpDao {

    /**
     * 测试 mybatis 内置参数
     * @param employee
     * @return
     */
    List<Emp> getEmpsTestInnerParameter(Emp employee);
}
