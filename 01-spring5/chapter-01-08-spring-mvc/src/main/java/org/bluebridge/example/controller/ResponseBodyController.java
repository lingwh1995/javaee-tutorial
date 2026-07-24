package org.bluebridge.example.controller;

import org.bluebridge.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 返回 json 格式数据
 *
 * @author lingwh
 * @date 2019/6/19 15:07
 */
@Controller
public class ResponseBodyController {

    /**
     * @ResponseBody 注解需要引用下面的三个包
     * SpringMVC 使用：HttpMessageConverter 将数据转换为 Json 格式
     */
    /*
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.9.9</version>
    </dependency>
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-core</artifactId>
        <version>2.9.9</version>
    </dependency>
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-annotations</artifactId>
        <version>2.9.9</version>
    </dependency>
    */

    /**
     * 返回 Json 格式数据
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "testResponsebody", method = RequestMethod.GET)
    public Person testResponsebody() {
        Person person = new Person("1", "zhangsan", "123456", "145@qq.com", 18);
        return person;
    }
}
