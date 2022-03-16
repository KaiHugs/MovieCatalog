package com.spring.moviecatalog.dao;

import com.spring.moviecatalog.model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MovieDaolmpl {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Movies> findAll(){
        List<Movies> list = jdbcTemplate.query("SELECT * FROM movies", (rs, rowNum) -> {
            Movies movie = new Movies();
            movie.setId(rs.getInt("id"));
            movie.setTitle(rs.getString("Title"));
            movie.setType(rs.getString("Type"));
            movie.setImdbID(rs.getString("imdbID"));
            movie.setPoster(rs.getString("Poster"));
            movie.setYear(rs.getString("Year"));
            movie.setCategory(rs.getString("Category"));
        });

        return list;
    }

    @Override
    public List<Movies> findByCategory(String category){
        List<Movies> list = jdbcTemplate.query("SELECT * FROM movies WHERE category ='"+category+"'", (rs, rowNum) -> {
            Movies movie = new Movies();
            movie.setId(rs.getInt("id"));
            movie.setTitle(rs.getString("Title"));
            movie.setType(rs.getString("Type"));
            movie.setImdbID(rs.getString("imdbID"));
            movie.setPoster(rs.getString("Poster"));
            movie.setYear(rs.getString("Year"));
            movie.setCategory(rs.getString("Category"));    
            return movie;
        });

        return list;
    }

    @Override
    public Boolean save(Movies movie){
        String sql = "SELECT count (*) FROM movies WHERE imdbID='"+movie.getImdb()+"'";
        int movies = jdbcTemplate.queryForObject(sql, Integer.class);
        if (movies == 0){
            String sq12 = "Insert into movies(Title, Type, imdbID, Year, Poster, Category) Values(?, ?, ?, ?, ?, ?)";
            jdbcTemplate.update(sq12, new Object[]{movie.getTitle(), movie.getType(), movie.getImdbID(), movie.getYear(), movie.getPoster(), movie.getCategory()});
            return true;
        }
        else {
            return false;
        }
    }
}
