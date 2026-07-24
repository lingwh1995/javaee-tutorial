package org.bluebridge.profile.demo.user.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * UserDao
 *
 * @author lingwh
 * @date 2026/1/10 14:35
 */
public class UserDao {
    private static final Logger logger = LogManager.getLogger(UserDao.class);

    public void deleteUserById(String id) {
        logger.info("正在执行根据id删除操作...[使用XML配置完成DI]");
    }
}
