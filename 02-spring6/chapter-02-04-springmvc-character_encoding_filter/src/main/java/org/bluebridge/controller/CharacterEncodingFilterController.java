package org.bluebridge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * CharacterEncodingFilterController
 *
 * @author lingwh
 * @date 2019/4/4 09:15
 */
@RequestMapping(value = "/characterEncodingFilter")
@Controller
public class CharacterEncodingFilterController {

    /**
     * 测试使用 Spring 提供的 CharacterEncodingFilter 类处理乱码问题
     * @return
     */
    @RequestMapping(value = "/dealEncoding", method = RequestMethod.POST)
    public String dealCharacterEncodingFilter(String username) {
        System.out.println(username);
        return "success";
    }
}
