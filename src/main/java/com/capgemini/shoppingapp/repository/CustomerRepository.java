package com.capgemini.shoppingapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.shoppingapp.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>  {

}
