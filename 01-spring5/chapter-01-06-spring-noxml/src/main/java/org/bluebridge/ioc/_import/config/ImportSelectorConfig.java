package org.bluebridge.ioc._import.config;

import org.springframework.context.annotation.Import;

/**
 * ImportSelector配置类
 *
 * @author lingwh
 * @date 2019/4/13 14:27
 */
@Import(MyImportSelector.class)
public class ImportSelectorConfig {

}
