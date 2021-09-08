package com.example.springdatajdbc.repository;

import com.example.springdatajdbc.model.Staff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffRepository  extends CrudRepository<Staff,Long>
{

}
