package org.bluebridge.designpattern.adapter_a;

/**
 * HTTP 处理器适配器
 *
 * @author lingwh
 * @date 2019/4/15 8:47
 */
public class HttpHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpController)handler).doHttpHandler();
    }
}
