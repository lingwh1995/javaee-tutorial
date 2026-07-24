package org.bluebridge.profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试时需要修改 web.xml 中使用的配置文件为    classpath:profile/springMVC-profile.xml
 *
 * @author lingwh
 * @date 2019/7/22 08:43
 */
@RequestMapping(value = "/handlerExceptionResolver")
@Controller
public class HandlerExceptionResolverController {

    /**
     * 测试 SpringMVC 的异常处理器    配置文件方式
     * @return
     */
    @RequestMapping(value = "/testHandlerExceptionResolverByProfile")
    public String testHandlerExceptionResolverByProfile() {
        // 模拟一个数学运算异常
        int i = 1 / 0;
        return "success";
    }
}
