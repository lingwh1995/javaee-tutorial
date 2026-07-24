package org.bluebridge.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * SpringMVC 的 RequestParam 注解
 *
 * 1. value：参数值
 * 2. required：是否一定要有这个参数，默认为 true，前台不传递会报错
 * 3. defaultValue：设置默认值(如果 required=true，前台又没有传递该该参数，此时 defaultValue 设置的值生效，不设置 defaultValue 时此种情况会报错)
 *
 * @author lingwh
 * @date 2019/6/20 14:22
 */
@Controller
public class RequestParamController {

    private static final String SUCCESS = "success";

    /**
     * RequestParam 注解
     *
     * @return
     */
    @RequestMapping(value="testRequestParam")
    public String testRequestParam(@RequestParam(value="username") String username,
                                   @RequestParam(value="age") Integer age,
                                   @RequestParam(value="school",required=false,defaultValue = "xaufe") String school){
        System.out.println("username:"+username+"----age:"+age);
        System.out.println("school:"+school);
        return SUCCESS;
    }
}