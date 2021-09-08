package com.example.springdatajdbc;

import com.example.springdatajdbc.service.DBService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
class SpringDataJdbcApplicationTests {

    @Autowired
    DBService dbService;

    @Test
    void contextLoads() {
    }

    @Test
    public void findAllCategories()
    {
        int size = StreamSupport.stream(dbService.findAllFilmCategoriesSortByName()
                .spliterator(),false).collect(Collectors.toList()).size();
        assertThat(size).isEqualTo(16);
    }

    @Test
    public void findFilmLanguage()
    {
        assertThat(StreamSupport.stream(dbService.findAllFilmByLanguage("Italian")
                .spliterator(),false).collect(Collectors.toList()).size()).isEqualTo(0);
    }

    @Test
    public void checkFilmStatus()
    {
        assertThat(dbService.checkFilmStatus(1L)).isEqualTo("Available");
    }


}
