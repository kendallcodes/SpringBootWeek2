package com.yogatools.inventory.repository;

import org.springframework.data.repository.CrudRepository;


import com.yogatools.inventory.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
