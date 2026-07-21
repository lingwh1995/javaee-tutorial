package org.bluebridge.controller;

import org.bluebridge.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 异常测试控制器，测试用户不存在异常
 *
 * @author lingwh
 * @date 2019/4/13 10:05
 */
@Controller
public class ExceptionController {

    /**
     * testexception 简称 te
     * 测试链接：
     *      http://localhost:8080/crud/te?user=aaa
     *
     * @param user
     * @return
     */
    @RequestMapping("/te")
    public String testexcExption(@RequestParam("user") String user){
        if("aaa".equalsIgnoreCase(user)){
            throw new UserNotExistException();
        }
        return "success";
    }
}
