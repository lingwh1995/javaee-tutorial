package org.bluebridge.profile.dibysetsenior.domain;

/**
 * 朋友实体类
 *
 * @author lingwh
 * @date 2026/1/10 17:03
 */
public class Friend {

    private String name;
    private String age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
