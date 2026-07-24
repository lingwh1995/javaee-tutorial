package org.bluebridge.mvcsuperior.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * SpringMVC 高级特性
 *
 * @author lingwh
 * @date 2019/7/8 13:32
 */
@Controller
public class SpringMVCSuperior {

    /**
     * WebRequest 是 Spring WebMVC 提供的统一请求访问接口，不仅仅可以访问请求相关数据，如参数区数据和请求头数据，但访问不
     * 到 Cookie 数据，还可以访问会话和上下文中的数据；NativeWebRequest 继承了 WebRequest，并提供访问本地 ServletAPI 的方法。
     *
     * @param webRequest
     * @return
     */
    @RequestMapping("testwebrequest")
    public String webRequest(WebRequest webRequest, NativeWebRequest nativeWebRequest) {
        // webRequest.getParameter：访问请求参数区的数据，可以通过 getHeader() 访问请求头数据
        System.out.println(webRequest.getParameter("test"));
        /**
          * webRequest.setAttribute/getAttribute：到指定的作用范围内取/放属性数据， Servlet 定义的三个作用范围分别使用如下常量代表
         *
          * SCOPE_REQUEST：代表请求作用范围
          * SCOPE_SESSION：代表会话作用范围
          * SCOPE_GLOBAL_SESSION：代表全局会话作用范围，即 ServletContext 上下文作用范围
         */
        webRequest.setAttribute("name", "value",WebRequest. SCOPE_REQUEST);
        System. out.println(webRequest.getAttribute("name",WebRequest. SCOPE_REQUEST));
        // nativeWebRequest.getNativeRequest/nativeWebRequest.getNativeResponse：得到本地 ServletAPI
        HttpServletRequest request = nativeWebRequest.getNativeRequest(HttpServletRequest.class);
        HttpServletResponse response = nativeWebRequest.getNativeResponse(HttpServletResponse.class);
        return "success";
    }
}
