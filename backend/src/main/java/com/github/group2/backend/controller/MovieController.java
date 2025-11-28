package com.github.group2.backend.controller;

import com.github.group2.backend.dto.MovieDTO;
import com.github.group2.backend.entity.Movie;
import com.github.group2.backend.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<MovieDTO> getMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/{publicId}")
    public MovieDTO getMovie(@PathVariable String publicId) {
        return movieService.getMovieByPublicId(publicId);
    }

    @PostMapping
    public Movie addMovie(@RequestBody MovieDTO movieDTO) {
        return movieService.saveMovie(movieDTO);
    }

    @DeleteMapping("/{publicId}")
    public void deleteMovie(@PathVariable String publicId) {
        movieService.deleteMovie(publicId);
    }

    @PostMapping("/{publicId}")
    public Movie updateMovie(@RequestBody MovieDTO movieDTO) {
        return null;
    }
}
