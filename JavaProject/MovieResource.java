package com.spring.moviecatalog.controller;

import com.spring.moviecatalong.model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotationl.*;
import com.springframework.moviecatalong.dao.MovieDao;

import java.util.List;

@RestController
@RequestMapping("/Movies")
public class MovieResource {
    @Autowired
    MovieDao movieRepository;
    public MovieResource(MovieDao movieRepository){
        this.movieRepository=movieRepository;
    }
    @GetMapping("/all")
    public List<Movies> getAll(){
        return movieRepository.findAll();
    }
    @GetMapping("/Favourites")
    public List<Movies> getFavourite(){
        return movieRepository.findByCategory("Favourites");
    }
    @GetMapping("/Watched")
    public List<Movies> getWatched(){
        return movieRepository.findByCategory("Watched");
    }
    @GetMapping("/Watch-Later")
    public List<Movies> getWatchLater(){
        return movieRepository.findByCategory("Water Later");
    }
    @PostMapping("/save")
    public ResponseEntity<Movies> save(@RequestBody Movies movie){
        movieRepository.save(movie);
        return new ResponseEntity<Movies>(movie, HttspStatus.OK);
    }
}
