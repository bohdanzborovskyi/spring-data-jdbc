package com.example.springdatajdbc.repository;

import com.example.springdatajdbc.model.Inventory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory,Long> {
}
