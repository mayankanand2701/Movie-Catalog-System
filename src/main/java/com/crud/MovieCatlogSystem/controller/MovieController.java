package com.crud.MovieCatlogSystem.controller;

import com.crud.MovieCatlogSystem.model.Movie;
import com.crud.MovieCatlogSystem.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/inputMovies")
    public Movie inputMovieDetails(@RequestBody Movie movie)
    {
        return movieService.createMovie(movie);
    }

    @GetMapping("/getAllMovies")
    public List<Movie> getAllMovie()
    {
        return movieService.getAllMovies();
    }

    @GetMapping("/getMovieById/{id}")
    public Movie getMovieById(@PathVariable int id) {
        return movieService.getMovieById(id);
    }

    // PUT for full update
    @PutMapping("/fullUpdateMovie/{id}")
    public Movie fullUpdateMovie(@PathVariable int id, @RequestBody Movie movie) {
        return movieService.fullUpdateMovie(id, movie);
    }

    // PATCH for partial update
    @PatchMapping("/partialUpdateMovie/{id}")
    public Movie partialUpdateMovie(@PathVariable int id, @RequestBody Movie movie) {
        return movieService.partialUpdateMovie(id, movie);
    }

    // DELETE by ID
    @DeleteMapping("/deleteMovieById/{id}")
    public String deleteMovie(@PathVariable int id) {
        return movieService.deleteMovieById(id);
    }

}
