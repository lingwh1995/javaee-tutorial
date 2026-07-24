package org.bluebridge.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/requestMapping")
@Controller
public class RequestMappingController {

    private static final Logger logger = LoggerFactory.getLogger(RequestMappingController.class);

    /**
     * 测试 @RequestMapping() 注解的 value 属性
     *      传递的 value/path 不匹配时报 404 错误
     * @return
     */
    @RequestMapping(value = {"/valueProperty_1","/valueProperty_2"})
    public String valueProperty() {
        logger.info("方法上的@RequestMapping注解的value属性可以匹配多个请求路径...");
        return "success";
    }

    /**
     * 测试 @RequestMapping() 注解的 method 属性
     *      传递的 method 不匹配时报 405 错误
     * @return
     */
    @RequestMapping(value = "methodProperty",method = {RequestMethod.GET,RequestMethod.POST})
    public String methodProperty() {
        logger.info("方法上的@RequestMapping注解的method属性可以匹配多种请求方式...");
        return "success";
    }

    /**
     * 测试 @RequestMapping() 注解的 params 属性
     *      要求参数中必须要有 username 和 password 这个参数，且 password 的值必须是 123456，才能成功匹配该请求
     *      传递的 params 不匹配时报 400 错误
     * @return
     */
    @RequestMapping(value = "paramsProperty",params = {"username","password=123456"})
    public String paramsProperty() {
        logger.info("方法上的@RequestMapping注解的params属性...");
        return "success";
    }

    /**
     * 测试 @RequestMapping() 注解的 headers 属性
     *      传递的 headers 不匹配时报 404 错误
     * @return
     */
    @RequestMapping(value = "headersProperty", headers = {"Host"})
    public String headersProperty() {
        logger.info("方法上的@RequestMapping注解的headers属性...");
        return "success";
    }

    /**
     * 测试 @RequestMapping 注解的 value 属性支持 ant 风格的 url 路径
     *      ?   表示任意的单个字符
     *      *   表示任意的 0 或者对个字符
     *      **  表示任意的一层或者多层目录
     * @return
     */
    @RequestMapping(value = "/a?t/antStyle")
    public String antStyle() {
        logger.info("方法上的@RequestMapping注解的value属性支持ant风格的url路径");
        return "success";
    }
}
