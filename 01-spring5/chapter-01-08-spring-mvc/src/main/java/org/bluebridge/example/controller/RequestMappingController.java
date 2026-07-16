package org.bluebridge.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * SpringMVC的RequestMapping注解
 *
 * 1. 用法类似于@RequestParam注解,可以获取所有的请求头信息
 * 2. 也有required属性
 *
 * @author lingwh
 * @date 2019/6/20 14:22
 */
@Controller
public class RequestMappingController {

    private static final String SUCCESS = "success";

    /**
     * 简单的Spring入门demo
     *
     * @return
     */
    @RequestMapping(value="hello")
    public String syaHello(){
        System.out.println("Hello World!");
        return SUCCESS;
    }

    /**
     * RequestMapping注解:
     *      value:请求url
     *      method:请求方式GET/POST
     *      params:支持简单的表达式,必须有name参数而且age参数的值不等于10
     *      headers:支持简单的表达式
     *
     * @return
     */
    @RequestMapping(value="testRequestMappping",
                    method= RequestMethod.GET,
                    params = {"username","age!=10"})
    public String testRequestMappping(){
        System.out.println("testRequestMappping!");
        return SUCCESS;
    }

}
