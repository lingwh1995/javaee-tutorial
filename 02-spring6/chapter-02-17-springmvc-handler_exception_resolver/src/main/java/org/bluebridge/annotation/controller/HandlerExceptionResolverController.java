package org.bluebridge.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试时需要修改 web.xml 中使用的配置文件为    classpath:annotation/springMVC-annotation.xml
 *
 * @author lingwh
 * @date 2019/7/22 08:43
 */
@RequestMapping(value = "/handlerExceptionResolver")
@Controller
public class HandlerExceptionResolverController {

    /**
     * 测试 SpringMVC 的异常处理器    注解方式
     * @return
     */
    @RequestMapping(value = "/testHandlerExceptionResolverByAnnotation")
    public String testHandlerExceptionResolverByAnnotation(Exception e, Model model) {
        // 模拟一个数学运算异常
        int i = 1 / 0;
        return "success";
    }
}
