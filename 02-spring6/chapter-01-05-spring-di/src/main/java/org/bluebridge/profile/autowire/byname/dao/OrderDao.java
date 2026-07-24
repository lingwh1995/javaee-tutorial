package org.bluebridge.profile.autowire.byname.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 根据属性名称 autowire   需要为属性创建 setter 方法
 */
public class OrderDao {
    private static final Logger logger = LogManager.getLogger(OrderDao.class);

    public void deleteById(String id) {
        logger.info("正在执行根据id删除操作...[使用XML配置完成DI-Autowire By Name]");
    }
}
