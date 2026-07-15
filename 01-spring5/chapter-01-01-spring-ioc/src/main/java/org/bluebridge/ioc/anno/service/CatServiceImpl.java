package org.bluebridge.ioc.anno.service;

import org.bluebridge.ioc.anno.dao.CatDao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 猫服务实现类
 *
 * @author lingwh
 * @date 2019/3/20 9:34
 */
@Component(value="catService")
public class CatServiceImpl implements ICatService{

    //@Autowired
    @Resource(name="catDao")
    private CatDao catDao;

    public void eat() {
        catDao.eat();
    }

}
