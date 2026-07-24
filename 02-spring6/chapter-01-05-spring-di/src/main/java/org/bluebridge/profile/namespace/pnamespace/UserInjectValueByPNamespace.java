package org.bluebridge.profile.namespace.pnamespace;

import org.bluebridge.profile.namespace.domain.Cat;

/**
 * set 方式注入之 P 命名空间注入  其底层还是依赖 set 方式实现注入，只不过 P 命名空间注入能让 Spring 的配置变得更为简单
 *
 * @author lingwh
 * @date 2026/1/10 14:27
 */
public class UserInjectValueByPNamespace {

    private String name;
    private String age;
    private Cat cat;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "UserInjectValueByPNamespace{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", cat=" + cat +
                '}';
    }
}
