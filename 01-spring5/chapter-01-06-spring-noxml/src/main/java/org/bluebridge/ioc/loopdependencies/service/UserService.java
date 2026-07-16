package org.bluebridge.ioc.loopdependencies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 零配置搭建 Spring 开发环境测试
 *
 * @author lingwh
 * @date 2019/4/4 10:40
 */
@Service
public class UserService {

    @Autowired
    private PersonService personService;

    public UserService(){
        System.out.println("UserService Constructor......");
    }

    public void getPersonService(){
        System.out.println("personService:"+personService);
    }
}
