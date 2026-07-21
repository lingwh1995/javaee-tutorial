package org.bluebridge.configuration.controller;

import org.bluebridge.configuration.domain.User;
import org.bluebridge.configuration.service.IUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * SpringBoot 通过 @Configuration + @Bean 配置 Controller
 *
 * 这里这个接口直接实现了标记接口，标记接口是被 @Controller 注解修饰的
 *
 * @author lingwh
 * @date 2019/11/19 10:32
 */
public class UserController implements MarkController {

    private IUserService userService;

    /**
     * 使用 set 方式注入
     *
     * @param userService 用户服务实例
     */
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    /**
     * 新增 user
     *
     * 访问   http://localhost:8080/add-user
     *
     * @return 响应结果
     */
    @RequestMapping(value = "/add-user",method = RequestMethod.GET)
    public ResponseEntity addUser() {
        //这里只是用来测试 SpringBoot 使用注解驱动配置代替传统 xml 配置，测试时前台不会给这个 user 传递具体的值，这里手动设置一下
        User user = new User("zhangsan","123456");
        int row = userService.addUser(user);
        return new ResponseEntity(row, HttpStatus.OK);
    }
}
