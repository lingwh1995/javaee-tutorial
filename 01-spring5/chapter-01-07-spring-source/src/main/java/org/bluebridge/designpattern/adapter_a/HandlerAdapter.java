package org.bluebridge.designpattern.adapter_a;

/**
 * 处理器适配器接口
 *
 * @author lingwh
 * @date 2019/4/15 8:43
 */
public interface HandlerAdapter {

    boolean supports(Object handler);

    void handle(Object handler);
}
