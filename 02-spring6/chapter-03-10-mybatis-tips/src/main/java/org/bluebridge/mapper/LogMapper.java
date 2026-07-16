package org.bluebridge.mapper;

import org.bluebridge.domain.Log;

import java.util.List;

/**
 * 日志Mapper接口
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public interface LogMapper {

    /**
     * 根据日期查询不同的数据库表中的全部信息
     *
     * @param date 日期字符串
     * @return 与日期对应的数据表中全部信息组成的集合
     */
    List<Log> selectAllLogByTableName(String date);
}
