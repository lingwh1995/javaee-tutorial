package org.bluebridge.controller;

import org.bluebridge.domian.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用 Springboot 自带类库解析 YML
 *
 * @author lingwh
 * @date 2020/3/5 14:36
 */
@RestController
public class YmlControllerSpringBootLib {

    /**
     * 获取 YML 中值方式一
     *
     * 直接注入 Yml 中属性的值
     */
    @Value("${server.port}")
    private Integer port;

    /**
     * 获取 YML 中值方式二
     *
     * 从环境中获取
     */
    @Autowired
    private Environment env;

    /**
     * 获取 YML 中值方式三
     *
     * 使用@ConfigurationProperties 将 yml 中的值注入到对象中
     * 特别注意 :Dog 是 Person 的属性，@ConfigurationProperties 只需要加在 Person 实体上，不需要加在 Dog 实体上
     */
    @Autowired
    private Person person;

    /**
     * 获取 YML 中值方式四
     *
     * 使用@Component("personYml")+@Qualifier("personYml")将yml中的值注入到对象中
     * 特别注意 :Dog是Person的属性,@Component("personYml")只需要加在Person实体上,不需要加在Dog实体上
     */
    @Qualifier("personYml")
    @Autowired
    private Person personYml;

    /**
     * 方式一获取 YML 中的值：
     * @return
     */
    @GetMapping("/yml/prot")
    public Integer getPropertityFromYml() {
        return port;
    }

    /**
     * 方式二获取 YML 中的值
     * @return
     */
    @GetMapping("/yml/application/name")
    public String getApplicationName() {
        String applicationName = env.getProperty("spring.application.name");
        return applicationName;

    }

    /**
     * 方式三获取 YML 中的值
     * @return
     */
    @GetMapping("/yml/person")
    public Person getPerson() {
        return person;
    }

    /**
     * 方式四获取 YML 中的值
     * @return
     */
    @GetMapping("/yml/person/qualifier")
    public Person getPersonYml() {
        return personYml;
    }
}
