package com.github.group2.backend.util;

import com.github.group2.backend.dto.MovieDTO;
import com.github.group2.backend.entity.Movie;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class MovieMapperTest {

    @Test
    void movieToMovieDto_shouldMapEntityToDTO() {
        Movie movie = new Movie("1", "Inception", "Sci-Fi");

        MovieDTO dto = MovieMapper.movieToMovieDto(movie);

        assertEquals("1", dto.id());
        assertEquals("Inception", dto.title());
        assertEquals("Sci-Fi", dto.genre());
    }

    @Test
    void movieDTOToEntity_shouldMapDTOToEntity() {
        MovieDTO dto = new MovieDTO("2", "Matrix", "Action");

        Movie entity = MovieMapper.movieDTOToEntity(dto);

        assertEquals("2", entity.getId());
        assertEquals("Matrix", entity.getTitle());
        assertEquals("Action", entity.getGenre());
    }

    @Test
    void constructor_shouldBePrivateAndThrowException() throws Exception {
        Constructor<MovieMapper> constructor = MovieMapper.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        InvocationTargetException ex =
                assertThrows(InvocationTargetException.class, constructor::newInstance);

        assertInstanceOf(IllegalStateException.class, ex.getCause());
        assertEquals("Utility class", ex.getCause().getMessage());
    }

}