package org.bluebridge.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ant 风格通配符
 *
 * 1. ? 匹配一个任意的字符
 * 2. * 匹配任意字符
 * 3. ** 匹配多层任意字符
 *
 * @author lingwh
 * @date 2019/6/20 13:25
 */
@Controller
public class PageJumpAndAntController {

    @RequestMapping(value="/a/{page}",method = RequestMethod.GET)
    public String page(@PathVariable("page") String page){
        System.out.println("路径:"+page);
        return page.replace(".action","");
    }
}
