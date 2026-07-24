package org.bluebridge.example.controller;

import org.bluebridge.domain.Address;
import org.bluebridge.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;

/**
 * 使用 @SessionAttribuate 把数据放在 request 域的同时放入 session 域中
 * 1. value：map 的 key 值，用法见①②③④
 * 2. type：map 的 value 的 Class 类型，用法见④
 *
 * @author lingwh
 * @date 2019/6/19 09:42
 */
@Controller
//@SessionAttributes("address")//①
//@SessionAttributes(value="address")//②
//@SessionAttributes(value={"user","address"})//③
//@SessionAttributes(value={"user","address"},types={String.class})//④加了 types={String.class}，session 同时会存放 map 的 value 类型为 String 的值
@SessionAttributes(types={User.class,Address.class})//⑤session 同时会存放 map 的 value 的 Class 卡类型为 User.class 和 Address.class 的值
public class SessionAttribuatesController {

    private static final String VIEWNAME = "modelView";

    @RequestMapping(value="testSessionAttribuates")
    public String testSessionAttribuates(Model model){
        Address address = new Address("陕西", "西安");
        model.addAttribute("address",address);
        model.addAttribute("time",new Date()+",testSessionAttribuates...");
        model.addAttribute("session","session");

        User user = new User("zhangsan", "123456", "@qq.com", 18, address);
        model.addAttribute("user",user);
        return VIEWNAME;
    }
}
