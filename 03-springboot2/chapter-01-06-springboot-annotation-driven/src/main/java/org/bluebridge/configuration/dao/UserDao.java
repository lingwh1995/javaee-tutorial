package org.bluebridge.configuration.dao;

import org.bluebridge.configuration.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * UserDao
 *
 * @author lingwh
 * @date 2026/7/13 09:30
 */
public class UserDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int addUser(User user) {
        System.out.println("jdbcTemplate = " + jdbcTemplate);
        System.out.println("模拟保存用户成功......");
        return 1;
    }
}
