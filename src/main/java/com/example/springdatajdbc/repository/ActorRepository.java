package com.example.springdatajdbc.repository;

import com.example.springdatajdbc.model.Actor;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends CrudRepository<Actor,Long>
{
    @Query("SELECT * FROM ACTOR a join FILM_ACTOR fa on a.actor_id=fa.actor_id " +
            "join FILM f  on fa.film_id=f.film_id where f.film_id = :id")
    Iterable<Actor> findAllByFilm(@Param("id") Long id);

    Actor findByFirstNameAndLastName(String firstName, String lastName);


}
