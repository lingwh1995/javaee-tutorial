package org.bluebridge.controller;

import org.bluebridge.service.SpringBootTestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * SpringBoot 测试示例的 Controller
 *
 * @author lingwh
 * @date 2025/11/4 17:57
 */
@Controller
public class SpringBootTestController {

    @Resource
    private SpringBootTestService springBootTestService;

    @ResponseBody
    @RequestMapping("/springboot-test")
    public String hello(){
        return springBootTestService.hello();
    }
}
