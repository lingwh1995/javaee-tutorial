package org.bluebridge.annotation.aspectorder.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * CatServiceImpl
 *
 * @author lingwh
 * @date 2019/7/22 14:29
 */
@Service("catService")
public class CatServiceImpl implements ICatService{

    private static final Logger logger = LogManager.getLogger(CatServiceImpl.class);

    @Override
    public void deleteCatById(String id) {
        logger.info("正在执行根据id删除操作...");
    }
}
