package org.bluebridge.noxml.demo.service;

import org.bluebridge.noxml.demo.domain.Order;

/**
 * IOrderService
 *
 * @author lingwh
 * @date 2026/1/10 14:43
 */
public interface IOrderService {

    void addOrder(Order order);
    void deleteOrderById(String id);
    void updateOrder(Order order);
    Order getOrderById(String id);
}
