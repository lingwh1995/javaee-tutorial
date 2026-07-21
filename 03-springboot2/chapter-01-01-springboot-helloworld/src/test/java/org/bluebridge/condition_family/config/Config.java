package org.bluebridge.condition_family.config;

import org.bluebridge.condition_family.domain.Dog;
import org.bluebridge.condition_family.domain.Person;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Condition 条件装配示例的配置类
 *
 * @author lingwh
 * @date 2019/11/14 10:59
 */
@Configuration
public class Config {

    @Bean
    public Dog dog(){
        return new Dog("小汪","10086");
    }

    /**
     * @ConditionalOnBean -当给定的在 bean 存在时，则实例化当前 Bean
     * @ConditionalOnMissingBean - 当给定的在 bean 不存在时，则实例化当前 Bean
     * @ConditionalOnClass - 当给定的类名在类路径上存在，则实例化当前 Bean
     * @ConditionalOnMissingClass - 当给定的类名在类路径上不存在，则实例化当前 Bean
     *
     * @return Person 实例
     */
    @Bean
    @ConditionalOnBean(name = "dog")
    //@ConditionalOnMissingBean(name = "dog")
    public Person person(){
        Person person = new Person();
        person.setName("张三");
        person.setAge(23);
        return person;
    }
}
