package org.bluebridge.annotation.autowired.location.service;

import org.bluebridge.annotation.autowired.location.dao.CatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CatServiceImpl
 *
 * @author lingwh
 * @date 2026/1/10 16:08
 */
@Service
public class CatServiceImpl implements ICatService{

    /**
     * 位置 1 @Autowired 可以配置在属性上
     */
    //@Autowired
    private CatDao catDao;

    /**
     * 位置 2 @Autowired 可以配置在 setter 方法上
     */
    @Autowired
    public void setCatDao(CatDao catDao) {
        this.catDao = catDao;
    }

    /**
     * 位置 3     @Autowired 可以配置在构造方法上
     */
//    @Autowired
//    public CatServiceImpl(CatDao catDao) {
//        this.catDao = catDao;
//    }

    @Override
    public void deleteById(String id) {
        catDao.deleteById(id);
    }
}
