package com.spring.moviecatalog.dao;

import com.spring.moviecatalog.model.Movies;

import java.util.List;

public interface MovieDao {
    List<Movies> findAll();
    List<Movies> findByCategory(String category);
    Boolean save(Movies Movie);
}
