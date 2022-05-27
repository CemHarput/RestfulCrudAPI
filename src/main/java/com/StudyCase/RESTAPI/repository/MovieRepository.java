package com.StudyCase.RESTAPI.repository;

import com.StudyCase.RESTAPI.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

    Movie findByName(String name);
}
