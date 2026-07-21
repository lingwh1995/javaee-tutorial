package org.bluebridge.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * RequestHeader 注解
 *
 * 1. 用法类似于 @RequestParam 注解，可以获取所有的请求头信息
 * 2. 也有 required 属性
 *
 * @author lingwh
 * @date 2019/6/20 14:22
 */
@Controller
public class RequestHeaderController {

    private static final String SUCCESS = "success";

    @RequestMapping(value="testRequestHeader")
    public String testRequestHeader(@RequestHeader("Accept") String accept,
                                    @RequestHeader("Content-Type") String contentType){
        System.out.println("Accept:"+accept);
        System.out.println("Content-Type:"+contentType);
        return SUCCESS;
    }
}