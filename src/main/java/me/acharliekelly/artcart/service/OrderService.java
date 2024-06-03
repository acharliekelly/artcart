package me.acharliekelly.artcart.service;

import me.acharliekelly.artcart.model.Order;

public interface OrderService {
    Iterable<Order> getAllOrders();

    Order create(Order order);

    void update(Order order);
}
