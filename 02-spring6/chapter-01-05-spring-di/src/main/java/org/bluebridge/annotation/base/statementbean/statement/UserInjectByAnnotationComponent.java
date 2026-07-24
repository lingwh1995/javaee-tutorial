package org.bluebridge.annotation.base.statementbean.statement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * UserInjectByAnnotationComponent
 *
 * @author lingwh
 * @date 2026/1/10 20:34
 */
@Component
public class UserInjectByAnnotationComponent {

    @Value("使用注解方式为属性注入非引用数据类型的值")
    private String type;
    @Value("张三")
    private String name;
    @Value("18")
    private Integer age;

    @Override
    public String toString() {
        return "UserInjectByAnnotation{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
