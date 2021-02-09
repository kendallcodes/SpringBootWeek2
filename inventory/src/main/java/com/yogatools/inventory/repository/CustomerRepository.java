package com.yogatools.inventory.repository;

import org.springframework.data.repository.CrudRepository;


import com.yogatools.inventory.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
