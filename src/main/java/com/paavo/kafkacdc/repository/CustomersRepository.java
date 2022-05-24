package com.paavo.kafkacdc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.paavo.kafkacdc.entity.Customer;

@RepositoryRestController
public interface CustomersRepository extends CrudRepository<Customer, Integer> {

}
