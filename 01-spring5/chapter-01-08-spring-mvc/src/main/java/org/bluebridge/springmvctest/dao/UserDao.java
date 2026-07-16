package org.bluebridge.springmvctest.dao;

import org.springframework.stereotype.Repository;

/**
 * 用户数据访问类
 *
 * @author lingwh
 * @date 2019/7/22 14:29
 */
@Repository
public class UserDao {

    public void eat(){
        System.out.println("吃东西......");
    }
}
