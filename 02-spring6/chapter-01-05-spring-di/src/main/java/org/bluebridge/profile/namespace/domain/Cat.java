package org.bluebridge.profile.namespace.domain;

/**
 * 猫实体类
 *
 * @author lingwh
 * @date 2026/1/10 16:08
 */
public class Cat {

    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
