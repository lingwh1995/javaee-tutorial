package org.bluebridge.profile.autowire.bytype.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * PersonDao
 *
 * @author lingwh
 * @date 2023/12/14 10:13
 */
public class PersonDao {
    private static final Logger logger = LogManager.getLogger(PersonDao.class);

    public void deleteById(String id) {
        logger.info("正在执行根据id删除操作...[使用XML配置完成DI-Autowire By Type]");
    }
}
