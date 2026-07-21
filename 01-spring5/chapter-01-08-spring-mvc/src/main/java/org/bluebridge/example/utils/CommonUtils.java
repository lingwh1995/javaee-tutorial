package org.bluebridge.example.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;

/**
 * 公共的工具类
 *
 * @author lingwh
 * @date 2026/7/13 20:56
 */
public class CommonUtils {

    public static <T> T toBean(Map map, Class<T> clazz) {
        try {
            // 1. 创建指定类型的 javabean 对象
            T bean = clazz.newInstance();
            // 2. 把数据封装到 javabean 中
            BeanUtils.populate(bean, map);
            // 3. 返回 javabean 对象
            return bean;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}