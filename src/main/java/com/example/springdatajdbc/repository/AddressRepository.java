package com.example.springdatajdbc.repository;

import com.example.springdatajdbc.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address,Long>
{
    Address findByAddressId(Long id);
}
