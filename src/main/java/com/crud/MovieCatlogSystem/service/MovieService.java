package com.crud.MovieCatlogSystem.service;

import com.crud.MovieCatlogSystem.model.Movie;
import com.crud.MovieCatlogSystem.repositoy.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepo movieRepo;

    public Movie createMovie(Movie movie) {
        return movieRepo.save(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepo.findAll();
    }

    public Movie getMovieById(int id) {
        Optional<Movie> optionalMovie = movieRepo.findById(id);
        return optionalMovie.orElse(null); // or throw exception if not found
    }

    public Movie fullUpdateMovie(int id, Movie newMovie) {
        Movie existing = getMovieById(id);
        if (existing == null) return null;

        // Overwrite all fields
        existing.setTitle(newMovie.getTitle());
        existing.setGenre(newMovie.getGenre());
        existing.setReleaseYear(newMovie.getReleaseYear());
        existing.setRating(newMovie.getRating());

        return movieRepo.save(existing);
    }


    public Movie partialUpdateMovie(int id, Movie updatedFields) {
        Movie existing = getMovieById(id);
        if (existing == null) return null;

        // Update only non-null fields
        if (updatedFields.getTitle() != null) {
            existing.setTitle(updatedFields.getTitle());
        }
        if (updatedFields.getGenre() != null) {
            existing.setGenre(updatedFields.getGenre());
        }
        if (updatedFields.getReleaseYear() != 0) {
            existing.setReleaseYear(updatedFields.getReleaseYear());
        }
        if (updatedFields.getRating() != 0.0) {
            existing.setRating(updatedFields.getRating());
        }

        return movieRepo.save(existing);
    }

    public String deleteMovieById(int id) {
        if (!movieRepo.existsById(id)) {
            return "Movie with ID " + id + " not found.";
        }
        movieRepo.deleteById(id);
        return "Movie with ID " + id + " deleted successfully.";
    }
}
