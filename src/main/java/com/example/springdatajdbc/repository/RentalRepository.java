package com.example.springdatajdbc.repository;

import com.example.springdatajdbc.model.Rental;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends PagingAndSortingRepository<Rental,Long>
{


    @Query("SELECT  * FROM RENTAL R JOIN INVENTORY I ON R.INVENTORY_ID=I.INVENTORY_ID JOIN FILM F ON F.FILM_ID=I.FILM_ID WHERE F.FILM_ID=:id")
    Iterable<Rental> findAllByFilm(@Param("id") Long id);

    Iterable<Rental> findAllByCustomerId(Long id);

}
