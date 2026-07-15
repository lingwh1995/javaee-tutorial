package org.bluebridge;

import org.bluebridge.configurationProperties_inject_by_configurationProperties.LibraryConfigInjectByEnableConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * SpringBoot 读取配置文件示例启动类
 *
 * @author lingwh
 * @date 2026/7/13 09:30
 */
@SpringBootApplication
@EnableConfigurationProperties(LibraryConfigInjectByEnableConfigurationProperties.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
