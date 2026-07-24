package org.bluebridge.juint4.test;

import org.bluebridge.juint4.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * SpringTest
 *
 * @author lingwh
 * @date 2026/1/10 14:30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest {

    @Autowired
    private IUserService userService;

    @Test
    public void testJUnit4() {
        userService.deleteUserById("001");
    }
}
