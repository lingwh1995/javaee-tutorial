package org.bluebridge.extend.config;

import org.bluebridge.extend.base.MySqlInjector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis-Plus配置类
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
@Configuration
public class MybatisPlusConfig {

    @Bean
    public MySqlInjector sqlInjector() {
        return new MySqlInjector();
    }
}
