package org.bluebridge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @RequestBody 接收请求体控制器
 *
 * @author lingwh
 * @date 2026/7/13 09:30
 */
@RequestMapping(value = "/httpmessageconverter")
@Controller
public class RequestBodyController {

    /**
     * 以字符串形式获取请求报文
     *
     * @param requestBody 请求体内容
     * @return 视图名称
     */
    @RequestMapping(value = "/requestBody",method = RequestMethod.POST)
    public String requestBody(@RequestBody String requestBody) {
        System.out.println("本次请求全部的请求体信息: " + requestBody);
        return "success";
    }
}
