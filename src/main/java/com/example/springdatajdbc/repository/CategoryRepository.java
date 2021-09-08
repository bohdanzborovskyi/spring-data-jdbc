package com.example.springdatajdbc.repository;

import com.example.springdatajdbc.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category,Long>
{
    List<Category> findAllBy();
}
