package org.bluebridge.condition_family.test;

import org.bluebridge.condition_family.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ConditionOnBean 条件装配测试
 *
 * @author lingwh
 * @date 2019/11/14 10:59
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ConditionOnBeanTest {

    @Autowired(required =false)
    private Person person;

    @Test
    public void fun(){
        System.out.println(person);
    }

}
