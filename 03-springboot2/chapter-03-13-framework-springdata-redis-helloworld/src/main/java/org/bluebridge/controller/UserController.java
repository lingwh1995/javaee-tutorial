package org.bluebridge.controller;

import org.bluebridge.domain.User;
import org.bluebridge.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户控制器
 *
 * @author lingwh
 * @date 2025/11/23 13:10
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 访问   http://localhost:8080/user
     *
     * @param id
     * @return
     */
    @ResponseBody
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") String id){
        return userService.getUserById(id);
    }
}
