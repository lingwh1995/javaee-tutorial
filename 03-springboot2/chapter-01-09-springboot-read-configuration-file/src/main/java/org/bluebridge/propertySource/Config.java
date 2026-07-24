package org.bluebridge.propertySource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 读取外部配置文件
 *
 * 1. 使用@PropertySource 读取外部配置文件，保存到运行的环境变量中
 *    @PropertySource(value={"classpath:/user.properties"})
 * 2. @Configuration 注解声明配置类
 *    可以使用@Component 注解声明配置类，不过使用@Configuration 注解声明配置类更加语义
 *
 * @author lingwh
 * @date 2019/11/19 09:15
 */
@PropertySource(value={"classpath:/user.properties"})
@Configuration
public class Config {

    @Bean
    public User user(){
        return new User();
    }
}
