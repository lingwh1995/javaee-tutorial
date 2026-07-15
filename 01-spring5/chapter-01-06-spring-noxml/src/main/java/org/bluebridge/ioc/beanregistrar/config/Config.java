package org.bluebridge.ioc.beanregistrar.config;

import org.bluebridge.ioc.beanregistrar.domain.Red;
import org.springframework.context.annotation.Import;

/**
 * ImportBeanDefinitionRegistrar配置类
 *
 * @author lingwh
 * @date 2019/4/9 14:25
 */
@Import({Red.class,MyImportBeanDefinitionRegistrar.class})
public class Config {

}
