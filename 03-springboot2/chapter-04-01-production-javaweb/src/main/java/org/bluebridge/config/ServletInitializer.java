package org.bluebridge.config;

import org.bluebridge.Application;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Servlet 初始化器，用于将 SpringBoot 应用部署为 WAR 包
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
