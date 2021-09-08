package com.example.springdatajdbc.repository;

import com.example.springdatajdbc.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long>
{

}
