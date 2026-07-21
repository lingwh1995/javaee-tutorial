package org.bluebridge.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 * 使用 @SessionAttribuate 获取已经存在的 session 数据
 *
 * @author lingwh
 * @date 2026/7/13 11:34
 */
@Controller
public class SessionAttribuateController {

    private static final String SUCCESS = "success";

    @RequestMapping(value="testSessionAttribuate")
    public String testSessionAttribuate(@SessionAttribute("username") String username){
        System.out.println(username);
        return SUCCESS;
    }
}
