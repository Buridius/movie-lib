package com.github.group2.backend.util;

import com.github.group2.backend.dto.MovieDTO;
import com.github.group2.backend.entity.Movie;

public class MovieMapper {
    private MovieMapper() {
        throw new IllegalStateException("Utility class");
    }

    public static MovieDTO movieToMovieDto(Movie movie) {
        return new MovieDTO(
                movie.getId(),
                movie.getTitle(),
                movie.getGenre()
        );
    }

    public static Movie movieDTOToEntity(MovieDTO movieDTO) {
        return new Movie(
                movieDTO.id(),
                movieDTO.title(),
                movieDTO.genre()
        );
    }
}
