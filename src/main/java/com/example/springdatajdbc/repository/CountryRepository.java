package com.example.springdatajdbc.repository;

import com.example.springdatajdbc.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CountryRepository extends CrudRepository<Country,Long>
{
    Country findByCountryId(Long id);

}
