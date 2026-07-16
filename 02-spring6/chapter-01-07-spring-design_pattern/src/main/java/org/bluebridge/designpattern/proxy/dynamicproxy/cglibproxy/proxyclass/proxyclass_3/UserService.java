package org.bluebridge.designpattern.proxy.dynamicproxy.cglibproxy.proxyclass.proxyclass_3;

/**
 * UserService
 *
 * @author lingwh
 * @date 2019/4/4 10:40
 */
public class UserService {

    private UserDao userDao = new UserDao();

    public void deleteById(String id) {
        userDao.deleteById(id);
    }

    public User getById(String id) {
        return userDao.getById(id);
    }

    public void showUsers() {
        userDao.showUsers();
    }
}
