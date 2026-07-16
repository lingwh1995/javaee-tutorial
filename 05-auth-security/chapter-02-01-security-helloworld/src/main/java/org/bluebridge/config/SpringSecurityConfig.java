package org.bluebridge.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 登录页面自定义
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
@SpringBootConfiguration
public class SpringSecurityConfig {

    //配置passwordEncode的实现类
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
