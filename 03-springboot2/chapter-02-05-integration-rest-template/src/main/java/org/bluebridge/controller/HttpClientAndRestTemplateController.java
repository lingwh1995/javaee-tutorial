package org.bluebridge.controller;

import org.bluebridge.domain.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于返回模拟数据
 *
 * @author lingwh
 * @date 2019/11/15 9:20
 */
@Controller
public class HttpClientAndRestTemplateController {

    /**
     * 测试 @ResponseBody 注解：加在类位置
     * 模拟 get 请求的接口
     * @return
     */
    /*
    @ResponseBody
    @GetMapping(value="/users")
    public List<User> getUsers(){
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("zs","18"));
        users.add(new User("ls","28"));
        users.add(new User("ww","38"));
        return users;
    }*/

    /**
     * 测试 @ResponseBody 注解：加在返回值位置
     * 模拟 get 请求的接口
     * @return
     */
    /*
    @GetMapping(value="/users")
    public @ResponseBody List<User> getUsers(){
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("zs","18"));
        users.add(new User("ls","28"));
        users.add(new User("ww","38"));
        return users;
    }*/

    /**
     * 测试 @RequestMapping 注解的 produces 属性：值为 produces = {"application/json;charset=UTF-8"}
     * 返回 json 格式数据注意事项：
     * 1. 加了 @ResponseBody 注解后，produes={"application/json;charset=UTF-8"} 可以省略
     * 2. produces 属性取值有两种：
     *      produces = {"application/json;charset=UTF-8"}
     *      produces = MediaType.APPLICATION_JSON_VALUE
     *
     * @return
     */
    @ResponseBody
    @GetMapping(value="/users",produces = {"application/json;charset=UTF-8"})
    public List<User> getUsers() {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("zs","18"));
        users.add(new User("ls","28"));
        users.add(new User("ww","38"));
        return users;
    }

    /**
     * 查询单个
     * @return
     */
    @ResponseBody
    @GetMapping(value="/user/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUsers(@PathVariable("id") Integer id) {
        if(id == 1){
            return new User("zs","18");
        }
        return null;
    }

    /**
     * 测试 @RequestMapping 注解的 produces 属性：值为"produces = {"application/xml;charset=UTF-8}
     * 返回 xml 格式数据注意事项：
     * 1. 要返回 xml 格式的数据，需要在 pom 中加入以下依赖
     *    <dependency>
     *        <groupId>com.fasterxml.jackson.dataformat</groupId>
     *        <artifactId>jackson-dataformat-xml</artifactId>
     *    </dependency>
     * 2. produces 属性的取值有两种：
     *    produces = {"application/xml;charset=UTF-8"}
     *    produces = MediaType.APPLICATION_XML_VALUE
     * 3. consumes="application/json"属性作用：
     *    方法仅处理 request Content-Type 为"application/json"类型的请求
     *
     * @return
     */
    /*
    @ResponseBody
    @GetMapping(value="/users",produces = MediaType.APPLICATION_XML_VALUE)
    public List<User> getUsers(){
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("zs","18"));
        users.add(new User("ls","28"));
        users.add(new User("ww","38"));
        return users;
    }*/
}
