package com.example.mediacatalog;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Represents a movie, which is a type of {@link MediaItem}.
 * In addition to the common media attributes, a movie has a director.
 */
public class Movie extends MediaItem{
    protected final SimpleStringProperty director;

    /**
     * Constructs a {@code Movie} with the specified title, release year, rating, and director.
     *
     * @param title       the title of the movie
     * @param releaseYear the release year of the movie
     * @param rating      the rating of the movie
     * @param director    the director of the movie
     */
    public Movie(String title, Integer releaseYear, Double rating, String director) {
        super(title, releaseYear, rating);
        this.director = new SimpleStringProperty(director);
    }

    /**
     * Returns the director property of the movie.
     *
     * @return the director as a {@link StringProperty}
     */
    public StringProperty getDirector() {
        return director;
    }
}
