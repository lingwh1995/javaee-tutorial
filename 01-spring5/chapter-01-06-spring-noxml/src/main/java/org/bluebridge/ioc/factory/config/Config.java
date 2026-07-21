package org.bluebridge.ioc.factory.config;

import org.bluebridge.ioc.factory.domain.ColorFactoryBean;
import org.springframework.context.annotation.Import;

/**
 * Spring 循环依赖
 *
 * @author lingwh
 * @date 2019/4/5 14:44
 */
@Import(ColorFactoryBean.class)
public class Config {

}
