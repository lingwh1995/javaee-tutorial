package org.bulebridge;

import org.bulebridge.controller.UserController;
import org.bulebridge.domain.User;

/**
 * 客户端测试类
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public class Client {

    public static void main(String[] args) {
        UserController userController = new UserController();
        User user = userController.findUserByUserId("001");
        System.out.println(user);
    }
}
