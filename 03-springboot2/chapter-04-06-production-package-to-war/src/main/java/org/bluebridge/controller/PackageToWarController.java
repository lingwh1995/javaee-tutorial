package org.bluebridge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * PackageToWarController
 *
 * @author lingwh
 * @date 2026/1/1 09:15
 */
@Controller
public class PackageToWarController {

    /**
     *  访问： http://localhost:8100/package-to-war
     * @return
     */
    @ResponseBody
    @RequestMapping("/package-to-war")
    public String packageToWar() {
        return "package-to-war: 测试将Springboot jar包打成war包并部署在tomcat中~";
    }
}
