package com.StudyCase.RESTAPI.service;

import com.StudyCase.RESTAPI.model.Movie;
import com.StudyCase.RESTAPI.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public Movie saveMovie(Movie movie){
      return  repository.save(movie);
    }
    public List<Movie> saveMovies(List<Movie> movies){
        return  repository.saveAll(movies);
    }
    public List<Movie> getMovies(){
        return repository.findAll();
    }

    public Movie getMovieById(int id){

        return repository.findById(id).orElse(null);
    }
    public Movie getMovieByName(String name){
        return repository.findByName(name);
    }
    public String deleteMovie(int id){
        repository.deleteById(id);
        return "Movie removed" + id;
    }
    public Movie updateMovie(Movie movie){
        Movie existingMovie = repository.findById(movie.getId()).orElse(null);
        existingMovie.setName(movie.getName());
        existingMovie.setCategory(movie.getCategory());
        existingMovie.setPrice(movie.getPrice());
        return repository.save(existingMovie);
    }


}
