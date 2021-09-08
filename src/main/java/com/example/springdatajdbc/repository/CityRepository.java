package com.example.springdatajdbc.repository;

import com.example.springdatajdbc.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City,Long>
{
    City findByCityId(Long id);

}
