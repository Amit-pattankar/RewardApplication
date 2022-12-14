package com.reward.repository;

import org.springframework.data.repository.CrudRepository;

import com.reward.entity.Customer;


public interface CustomerRepository extends CrudRepository<Customer,Long> {
    public Customer findByCustomerId(Long customerId);
}
