package com.yogatools.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.yogatools.inventory.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
