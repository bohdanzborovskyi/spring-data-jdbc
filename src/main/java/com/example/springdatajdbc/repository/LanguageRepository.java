package com.example.springdatajdbc.repository;

import com.example.springdatajdbc.model.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends CrudRepository<Language,Long>
{

    Language findByName(String name);

}