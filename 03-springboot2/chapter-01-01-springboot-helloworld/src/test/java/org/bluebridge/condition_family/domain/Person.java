package org.bluebridge.condition_family.domain;

/**
 * Condition 条件装配示例的 Person 实体
 *
 * @author lingwh
 * @date 2019/11/14 10:58
 */
public class Person {

    private String name;
    private Integer age;

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
