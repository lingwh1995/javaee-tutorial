package org.bluebridge.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * SpringBoot整合Filter的第二种方式示例
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
@WebFilter(urlPatterns ="/myServlet3")
public class MyFilter3 implements Filter{

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter执行了......");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        System.out.println(request.getRequestURL().toString());
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter初始化......");
    }

    @Override
    public void destroy() {
        System.out.println("filter Destory......");
    }
}
