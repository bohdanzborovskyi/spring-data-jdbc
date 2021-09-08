package com.example.springdatajdbc.repository;

import com.example.springdatajdbc.model.Film;
import com.example.springdatajdbc.service.FilmMapper;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends PagingAndSortingRepository<Film,Long>
{

    @Query(value = "SELECT * from FILM f join FILM_CATEGORY fc on f.film_id=fc.film_id " +
            "join CATEGORY c on fc.category_id=c.category_id where c.name= :name",
                rowMapperClass = FilmMapper.class)
    Iterable<Film> findAllByFilmCategry(@Param("name") String category);

    @Query(value = "SELECT * from FILM f  where f.language_id= :id",
            rowMapperClass = FilmMapper.class)
    Iterable<Film> findAllByLanguage(@Param("id")Long id);

    @Query(value="SELECT * FROM FILM F JOIN FILM_ACTOR FA ON F.FILM_ID=FA.FILM_ID WHERE FA.ACTOR_ID=:id",
            rowMapperClass = FilmMapper.class)
    Iterable<Film> findAllByActorId(@Param("id") Long id);

}
