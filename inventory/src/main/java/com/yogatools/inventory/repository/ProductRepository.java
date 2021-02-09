package com.yogatools.inventory.repository;

import org.springframework.data.repository.CrudRepository;


import com.yogatools.inventory.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{


}
