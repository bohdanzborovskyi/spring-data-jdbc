package com.example.springdatajdbc.repository;

import com.example.springdatajdbc.model.Payment;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<Payment,Long>
{

    @Query("SELECT * FROM PAYMENT P WHERE P.CUSTOMER_ID=:id")
    Iterable<Payment> findAllPaymentByCustomer(@Param("id")Long id);

}
