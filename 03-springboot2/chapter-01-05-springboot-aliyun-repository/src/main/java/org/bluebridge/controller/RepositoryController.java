package org.bluebridge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 阿里云镜像仓库测试控制器
 *
 * @author lingwh
 * @date 2019/11/19 14:15
 */
@Controller
public class RepositoryController {

    @ResponseBody
    @RequestMapping("/repository")
    public String repository(){
        return "springboot repository~[使用阿里云镜像仓库]";
    }
}
