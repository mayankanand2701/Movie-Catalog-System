package com.crud.MovieCatlogSystem.repositoy;

import com.crud.MovieCatlogSystem.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends JpaRepository<Movie,Integer> {
}
