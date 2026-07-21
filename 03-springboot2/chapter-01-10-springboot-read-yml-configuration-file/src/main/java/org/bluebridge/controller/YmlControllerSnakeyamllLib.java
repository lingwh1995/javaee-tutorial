package org.bluebridge.controller;

import org.bluebridge.domian.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.Yaml;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 方式六获取 YML 中的值
 *
 * 使用 Snakeyaml 自带类库解析 YML
 *
 * 注意
 * 1. 实体要有无参构造
 * 2. 要额外引入相关类库
 *
 * @author lingwh
 * @date 2020/3/5 15:12
 */
@RestController
public class YmlControllerSnakeyamllLib {

    /**
     * 通过 Spring 容器来管理 Snakeyaml 实例对象
     *
     * 特别注意：使用@Resource 注解来获取注入的对象
     * @return
     */
    @Bean(name="snakeyaml")
    public Yaml yaml() {
        return new Yaml();
    }

    @Resource(name = "snakeyaml")
    private Yaml snakeyaml;

    /**
     * 使用 snakeyaml 解析 yml 文件，并将解析结果封装到实体中
     */
    @GetMapping("/yml/snake/student")
    public Student getStudent() {
        Student student = snakeyaml.loadAs(YmlControllerSnakeyamllLib.class.getResourceAsStream("/student.yml"), Student.class);
        return student;
    }

    /**
     * 使用 snakeyaml 解析 yml 文件，并将解析结果封装到 Map 中
     */
    @GetMapping("/yml/snake/studentmap")
    public Map getStudentMap() {
        Map studentMap = snakeyaml.loadAs(YmlControllerSnakeyamllLib.class.getResourceAsStream("/student.yml"), Map.class);
        return studentMap;
    }
}