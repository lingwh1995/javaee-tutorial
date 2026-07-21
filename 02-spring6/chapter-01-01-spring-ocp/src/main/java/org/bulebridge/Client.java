package org.bulebridge;

import org.bulebridge.controller.UserController;
import org.bulebridge.domain.User;

/**
 * 客户端测试类
 *
 * @author lingwh
 * @date 2023/10/12 16:20
 */
public class Client {

    public static void main(String[] args) {
        UserController userController = new UserController();
        User user = userController.findUserByUserId("001");
        System.out.println(user);
    }
}
