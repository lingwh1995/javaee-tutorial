package org.bluebridge;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

/**
 * Import 功能测试
 *
 * @author lingwh
 * @date 2019/7/22 09:15
 */
@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/")
    public String index(HttpServletResponse response) {
        // 为了测试 @CookieValue 注解，这里我们手动添加一个 Cookie
        Cookie cookie = new Cookie("token", UUID.randomUUID().toString().toLowerCase().replace("-",""));
        response.addCookie(cookie);

        logger.info("跳转到首页...");
        return "index";
    }
}
