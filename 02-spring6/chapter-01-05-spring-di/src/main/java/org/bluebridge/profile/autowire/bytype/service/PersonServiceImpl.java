package org.bluebridge.profile.autowire.bytype.service;

import org.bluebridge.profile.autowire.bytype.dao.PersonDao;

/**
 * 根据属性类型 autowire   需要为属性创建 setter 方法
 *
 * @author lingwh
 * @date 2023/12/14 10:35
 */
public class PersonServiceImpl implements IPersonService {

    private PersonDao orderDao;

    public void setOrderDao(PersonDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public void deleteById(String id) {
        orderDao.deleteById(id);
    }
}
