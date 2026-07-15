package org.bluebridge;

import org.bluebridge.config.MqttProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * SpringBoot启动类
 *
 * @author lingwh
 * @date 2026/7/13 9:00
 */
@SpringBootApplication
@EnableConfigurationProperties(MqttProperties.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
