package org.bluebridge.propertySource;

import org.springframework.beans.factory.annotation.Value;

/**
 * 使用 @Value 读取 properties 配置文件的用户实体
 *
 * @author lingwh
 * @date 2026/7/13 09:30
 */
public class User {

    /**
     * 使用@Value 赋值：
     * 1. 基本数值
     * 2. 可以写 SpEL
     * 3. 可以写 ${}，取出配置文件中的值
     */
    //使用@Value 直接赋值
    @Value("zhangsan")
    private String name;

    //使用 SpEL 直接执行计算
    @Value("#{20-4}")
    private Integer age;

    //读取 properties 中的配置
    @Value("${person.school}")
    private String school;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }
}
