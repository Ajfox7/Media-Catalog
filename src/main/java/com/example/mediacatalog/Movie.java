package com.example.mediacatalog;

public class Movie extends MediaItem{
    protected String director;

    public Movie(String title, Integer releaseYear, Double rating, String director) {
        super(title, releaseYear, rating);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }
}
