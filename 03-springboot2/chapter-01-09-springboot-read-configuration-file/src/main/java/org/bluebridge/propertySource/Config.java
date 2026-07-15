package org.bluebridge.propertySource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 读取外部配置文件
 *
 * 1. 使用@PropertySource读取外部配置文件，保存到运行的环境变量中
 *    @PropertySource(value={"classpath:/user.properties"})
 * 2. @Configuration注解声明配置类
 *    可以使用@Component注解声明配置类，不过使用@Configuration注解声明配置类更加语义
 *
 * @author lingwh
 * @date 2026/7/13 09:30
 */
@PropertySource(value={"classpath:/user.properties"})
@Configuration
public class Config {

    @Bean
    public User user(){
        return new User();
    }
}
