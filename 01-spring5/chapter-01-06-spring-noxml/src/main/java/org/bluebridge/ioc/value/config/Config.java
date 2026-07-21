package org.bluebridge.ioc.value.config;

import org.bluebridge.ioc.value.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 使用 @PropertySource 读取外部配置文件中的 K/V，保存到运行的环境变量中
 *
 * @author lingwh
 * @date   2019/4/3 14:32
 */
@PropertySource(value = {"classpath:/person.properties"})
@Configuration
public class Config {

    @Bean
    public Person person(){
        return new Person();
    }
}
