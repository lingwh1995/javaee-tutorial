package org.bluebridge.ioc.autoinject.dbutils;

import org.springframework.stereotype.Component;

/**
 * 数据库工具类
 *
 * @author lingwh
 * @date 2019/4/12 12:21
 */
@Component(value="dbutils")
public class DBUtils {

    public void save(){
        System.out.println("执行保存到数据库的方法......DBUtils......");
    }
}
