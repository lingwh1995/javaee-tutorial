package org.bluebridge.server.service;

/**
 * 用户服务工厂
 *
 * @author lingwh
 * @date 2026/7/10 10:58
 */
public abstract class UserServiceFactory {

    private static UserService userService = new UserServiceMemoryImpl();

    public static UserService getUserService() {
        return userService;
    }
}
