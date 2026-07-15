package org.bluebridge.profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试时需要修改web.xml中使用的配置文件为    classpath:profile/springMVC-profile.xml
 *
 * @author lingwh
 * @date 2026/7/13 8:43
 */
@RequestMapping(value = "/handlerExceptionResolver")
@Controller
public class HandlerExceptionResolverController {

    /**
     * 测试SpringMVC的异常处理器    配置文件方式
     * @return
     */
    @RequestMapping(value = "/testHandlerExceptionResolverByProfile")
    public String testHandlerExceptionResolverByProfile() {
        // 模拟一个数学运算异常
        int i = 1 / 0;
        return "success";
    }
}
