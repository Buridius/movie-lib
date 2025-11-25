package com.github.group2.backend.entity;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
@Getter
public class Movie {
    @Id
    private String id;
    private String publicId;
    private String title;
    private String genre;

    public Movie(String id,String publicId, String title, String genre) {
        this.id = id;
        this.publicId = publicId;
        this.title = title;
        this.genre = genre;
    }
}
