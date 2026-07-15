package org.bluebridge.ioc.context.config;

import org.bluebridge.ioc.context.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring无XML配置类
 *
 * @author lingwh
 * @date 2019/4/7 8:19
 */
@Configuration
public class Config {

    @Bean
    public User user() {
        return new User("张三", 20);
    }

}
