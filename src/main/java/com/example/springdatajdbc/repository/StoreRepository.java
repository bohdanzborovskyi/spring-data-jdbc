package com.example.springdatajdbc.repository;

import com.example.springdatajdbc.model.Store;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends CrudRepository<Store,Long>
{

}
