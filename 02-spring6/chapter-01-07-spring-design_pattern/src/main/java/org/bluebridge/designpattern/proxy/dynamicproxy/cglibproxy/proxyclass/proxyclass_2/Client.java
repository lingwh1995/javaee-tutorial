package org.bluebridge.designpattern.proxy.dynamicproxy.cglibproxy.proxyclass.proxyclass_2;

/**
 * 客户端
 *
 * java8 以上环境运行时需要添加 VM 参数，否则会报错   --add-opens java.base/java.lang=ALL-UNNAMED
 *
 * @author lingwh
 * @date 2019/4/4 11:10
 */
public class Client {

    public static void main(String[] args) {
        // 1. 创建被代理对象
        TeacherDao teacherDao = new TeacherDao();
        // 2. 创建代理对象
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        TeacherDao proxyInstance = (TeacherDao)proxyFactory.getProxyInstance();
        // 3. 调用代理对象方法
        // 有返回值
        String zhangsan = proxyInstance.sayName("张三");
        System.out.println("返回值 = " + zhangsan);
        // 无返回值
        proxyInstance.teach();
    }
}
