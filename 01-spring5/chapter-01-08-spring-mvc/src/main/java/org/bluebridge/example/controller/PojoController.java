package org.bluebridge.example.controller;

import org.bluebridge.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * SpringMVC 接受 POJO 类型的参数
 *
 * 级联操作注意事项：
 * 1. User 中有一个属性是 Address 类型的，如果这个 Address 没有无参构造方法，则在级联操作时会发生异常
 *      异常名称：org.springframework.beans.NullValueInNestedPathException
 * 2. 涉及到中文数据传输时，可能会乱码，配置 Sping 提供的过滤器即可，但是这个过滤器要配置在 web.xml 的最上面的位置
 * 3. 如果表单中的属性在实体中不存在，不会报错，但是需要在后台单独接收该参数
 *
 * @author lingwh
 * @date 2019/6/20 14:07
 */
@Controller
public class PojoController {

    private static final String SUCCESS = "success";

    /**
     * RequestParam 注解
     *
     * @return
     */
    @RequestMapping(value="testPojo",method = RequestMethod.POST)
    public String testPojo(User user, @RequestParam("other") String other){
        System.out.println("user"+user);
        System.out.println("other"+other);
        return SUCCESS;
    }
}