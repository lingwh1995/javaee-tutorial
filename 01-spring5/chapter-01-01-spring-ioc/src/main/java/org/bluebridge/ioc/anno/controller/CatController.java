package org.bluebridge.ioc.anno.controller;

import org.bluebridge.ioc.anno.service.ICatService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * 猫控制器
 *
 * @author lingwh
 * @date 2019/3/20 9:35
 */
@Controller("catController")
public class CatController {

    //@Autowired
    @Resource(name="catService")
    private ICatService catService;

    public void eat(){
        catService.eat();
    }
}