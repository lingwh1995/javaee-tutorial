package org.bluebridge.ioc.basic.domain;

/**
 * 演示 Setter 注入
 *
 * @author lingwh
 * @date 2019/3/17 9:50
 */
public class Dog {

    private String name;

    private double price;

    /**
     * Setter 注入时用到
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter 注入时用到
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
