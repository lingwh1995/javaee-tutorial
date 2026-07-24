package org.bluebridge.profile.demo.service;

import org.bluebridge.profile.demo.domain.Order;

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
