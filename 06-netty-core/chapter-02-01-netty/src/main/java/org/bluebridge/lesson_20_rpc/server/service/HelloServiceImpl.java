package org.bluebridge.lesson_20_rpc.server.service;

/**
 * HelloServiceImpl
 *
 * @author lingwh
 * @date 2026/7/13 17:24
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String msg) {
        // int i = 1 / 0;
        return "你好, " + msg;
    }
}