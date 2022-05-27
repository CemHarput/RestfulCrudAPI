package com.StudyCase.RESTAPI.controller;

import com.StudyCase.RESTAPI.model.Movie;
import com.StudyCase.RESTAPI.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private MovieService service;

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie){
        return service.saveMovie(movie);
    }
    @PostMapping("/addMovies")
    public List<Movie> addMovies(@RequestBody List<Movie> movies){
        return service.saveMovies(movies);
    }
    @GetMapping("/movies")
    public List<Movie> findAllMovies(){
        return service.getMovies();
    }

    @GetMapping("/movie/{id}")
    public Movie findMovieById(@PathVariable  int id){
        return service.getMovieById(id);
    }

    @GetMapping("/movie_name/{name}")
    public Movie findMovieByName(@PathVariable  String name){
        return service.getMovieByName(name);
    }

    @PutMapping("/update")
    public Movie updateMovie(@RequestBody Movie movie){
        return service.updateMovie(movie);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMovie(@PathVariable int id){
        return service.deleteMovie(id);
    }
}
