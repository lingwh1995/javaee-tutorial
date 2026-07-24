package org.bluebridge.designpattern.proxy.dynamicproxy.cglibproxy.proxyclass.proxyclass_1;

/**
 * 客户端
 *
 * java8 以上环境运行时需要添加 VM 参数，否则会报错   --add-opens java.base/java.lang=ALL-UNNAMED
 *
 * @author lingwh
 * @date 2019/4/4 11:05
 */
public class Client {

    public static void main(String[] args) {
        // proxy
        UserServiceImpl userService = (UserServiceImpl) new UserLogProxy().getUserLogProxy(new UserServiceImpl());

        // call methods
        userService.findUserList();
        userService.addUser();
    }
}
