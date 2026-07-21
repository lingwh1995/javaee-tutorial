package org.bluebridge.mvcsuperior.controller;

import org.bluebridge.mvcsuperior.service.IRequestContextHolderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * SpringMVC 高级特性
 *
 * @author lingwh
 * @date 2019/7/23 11:05
 */
@Controller
public class RequestContextHolderController {

    @Resource
    private IRequestContextHolderService requestContextHolderService;

    /**
     * 测试在 Service 层获取 HttpServletRequest/HttpServletResponse 对象
     *
     * @return
     */
    @RequestMapping("/testServiceHttpServletRequest")
    public String testServiceHttpServletRequest(){
        // 获取 HttpServletRequest 对象
        HttpServletRequest request = requestContextHolderService.getHttpServletRequest();
        System.out.println(request.getRequestURI());
        // 获取 HttpServletResponse 对象
        HttpServletResponse response = requestContextHolderService.getHttpServletResponse();
        System.out.println(response);
        return "success";
    }
}
