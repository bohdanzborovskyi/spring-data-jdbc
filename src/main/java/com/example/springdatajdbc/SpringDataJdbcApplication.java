package com.example.springdatajdbc;

import com.example.springdatajdbc.repository.ActorRepository;
import com.example.springdatajdbc.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringDataJdbcApplication
{

    @Autowired
    DBService dbService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJdbcApplication.class, args);

    }

    @PostConstruct
    public void checkDB()
    {
//        dbService.findAllFilmCategoriesSortByName().forEach(category ->
//        System.out.println(category.getName()));
//        dbService.findAllFilmByCategory("Horror").forEach(film -> System.out.println(film.getTitle()));
//        dbService.findAllFilmByLanguage("English").forEach(film -> System.out.println(film.getTitle()));
//        dbService.findAllActorByFilm(2L).forEach(actor -> System.out.println(actor.getFirstName() + " " + actor.getLastName()));
//        System.out.println(dbService.checkFilmStatus(1L));
//        dbService.findAllPaymentByCustomer(1L).forEach(payment -> System.out.println(payment.getAmount()));
//        System.out.println(dbService.findCustomerAndAddress(1L));
//        System.out.println(dbService.findAllStaffInfo());
//        dbService.findAllFilmByActorFirstNameAndLastName("Penelope","Guiness").forEach(film -> System.out.println(film.getTitle()));
        dbService.findAllPaymentByCustomer(1L).forEach(payment -> System.out.println(payment.getPaymentDate() + " payment amount: " + payment.getAmount()));
    }



}
