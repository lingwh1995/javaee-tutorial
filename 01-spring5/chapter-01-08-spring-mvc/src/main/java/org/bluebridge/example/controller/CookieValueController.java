package org.bluebridge.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @CookieValue 注解
 *
 * 1. 用法类似于 @RequestParam 注解，可以获取所有的请求头信息
 * 2. 也有 required 属性
 *
 * @author lingwh
 * @date 2019/6/19 15:44
 */
@Controller
public class CookieValueController {

    private static final String SUCCESS = "success";

    @RequestMapping(value="testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String jsessionid){
        System.out.println("JSESSIONID:"+jsessionid);
        return SUCCESS;
    }

}