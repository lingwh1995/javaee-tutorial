package org.bluebridge.ioc.customercomponment.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义组件配置类
 *
 * @author lingwh
 * @date 2019/4/6 13:45
 */
@Configuration
@ComponentScan({"org.bluebridge.ioc.customercomponment.domain"})
public class Config {

}
