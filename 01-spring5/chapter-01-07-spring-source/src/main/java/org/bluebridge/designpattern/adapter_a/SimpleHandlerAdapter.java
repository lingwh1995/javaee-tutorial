package org.bluebridge.designpattern.adapter_a;

/**
 * 简单处理器适配器
 *
 * @author lingwh
 * @date 2019/4/15 8:45
 */
public class SimpleHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController)handler).doSimplerHandler();
    }
}
