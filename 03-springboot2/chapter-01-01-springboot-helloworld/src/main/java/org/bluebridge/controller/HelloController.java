package org.bluebridge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * SpringBoot HelloWorld 入门示例的 Hello 控制器
 *
 * @author lingwh
 * @date 2026/7/13 09:30
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello~";
    }
}
