package com.example.mediacatalog;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Movie extends MediaItem{
    protected final SimpleStringProperty director;

    public Movie(String title, Integer releaseYear, Double rating, String director) {
        super(title, releaseYear, rating);
        this.director = new SimpleStringProperty(director);
    }

    public StringProperty getDirector() {
        return director;
    }
}
