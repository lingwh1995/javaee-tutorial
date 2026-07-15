package org.bluebridge.designpattern.template_a;

/**
 * 可配置的应用上下文接口
 *
 * @author lingwh
 * @date 2019/4/15 14:13
 */
public interface ConfigurableApplicationContext {

    void refresh() throws IllegalStateException;
}
