package com.example.springdatajdbc.service;


import com.example.springdatajdbc.model.Film;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class FilmMapper implements RowMapper<Film>
{

    @Override
    public Film mapRow(ResultSet rs, int rowNum) throws SQLException
    {
       Film f = new Film();
       f.setFilmId(rs.getLong("film_id"));
       f.setTitle(rs.getString("title"));
       f.setDescription(rs.getString("description"));
       f.setReleaseYear(rs.getString("release_year"));
       f.setLanguageId(rs.getLong("language_id"));
       f.setRentalDuration(rs.getInt("rental_duration"));
       f.setRentalRate(rs.getString("rental_rate"));
       f.setLength(rs.getInt("length"));
       f.setReplacementCost(rs.getString("replacement_cost"));
       f.setRating(rs.getString("rating"));
       f.setLastUpdate(rs.getDate("last_update").toLocalDate());
       f.setSpecialFeatures(rs.getString("special_features"));
       f.setFulltext(rs.getString("fulltext"));
       f.setVersionValue(rs.getInt("version_value"));
       return f;
    }
}
