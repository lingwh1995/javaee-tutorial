package org.bluebridge.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * SpringMVC 的 Rest 风格的 URL
 *
 * 向后台发送 PUT/DELETE 请求要求如下
 * 1. 需要在 web.xml 中配置 HiddenHttpMethodFilter
 * 2. 需要发送 post 请求
 * 3. 在发送 post 请求的时候在表单中携带一个 name="_method",value="PUT"/value="DELETE" 的隐藏域
 *
 * REST 风格的 C0RUD(以订单为例)
 *
 * REST 风格 URL 写法      请求方式    传统的 URL 写法
 * 新增：/order       POST
 * 修改：/order/1     PUT         /update?id=1
 * 删除：/order/1     DELETE      /delete?id=1
 * 查询：/order/1     GET         /get?id=1
 *
 * 3. PathVariable("id")：使用这个注解获取 URL 中的参数值
 *
 * @author lingwh
 * @date 2019/6/20 10:17
 */
@Controller
public class RestfulPatternUrlController {

    private static final String SUCCESS = "success";

    /**
     * 增加
     *
     * @return
     */
    @RequestMapping(value="testPost",method=RequestMethod.POST)
    public String testPost(){
        System.out.println("testPost");
        return SUCCESS;
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value="testDelete/{id}",method=RequestMethod.DELETE)
    public String testDelete(@PathVariable("id") String id){
        System.out.println("testDelete"+id);
        return SUCCESS;
    }

    /**
     * 修改
     *
     * @param id
     * @return
     */
    @RequestMapping(value="testPut/{id}",method=RequestMethod.PUT)
    public String testPut(@PathVariable("id") String id){
        System.out.println("testPut"+id);
        return SUCCESS;
    }

    /**
     * 查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value="testGet/{id}",method=RequestMethod.GET)
    public String testGet(@PathVariable("id") String id){
        System.out.println("testGet"+id);
        return SUCCESS;
    }
}
