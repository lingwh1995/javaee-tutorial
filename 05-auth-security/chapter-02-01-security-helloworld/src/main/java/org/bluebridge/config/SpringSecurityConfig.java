package org.bluebridge.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 登录页面自定义
 *
 * @author lingwh
 * @date 2025/12/10 11:30
 */
@SpringBootConfiguration
public class SpringSecurityConfig {

    //配置 passwordEncode 的实现类
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
