package me.acharliekelly.artcart.repository;

import me.acharliekelly.artcart.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> { }
