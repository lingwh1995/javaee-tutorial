package com.xa8bit.mybatis_a.executor;

import com.xa8bit.mybatis_a.mapper.MapperStatement;

import java.util.List;

/**
 * 执行器接口，负责真正执行SQL查询操作
 *
 * @author lingwh
 * @date 2026/7/13 10:30
 */
public interface Executor {

    /**
     * Executor会真正的执行查询操作
     *
     * @param mapperStatement 封装了Mapper.xml中<select></select>等标签中保存的信息
     * @param params 指定的sql语句执行对应要传入的参数
     * @param <E> 返回指定的类型
     * @return
     */
    <E> List<E> query(MapperStatement mapperStatement, Object... params);
}
