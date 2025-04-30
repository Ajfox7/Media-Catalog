package com.example.mediacatalog;

import javafx.beans.property.*;

public class MediaItem {
    private final SimpleStringProperty title;
    private final SimpleIntegerProperty year;
    private final SimpleDoubleProperty rating;

    public MediaItem(String title, int year, double rating) {
        this.title = new SimpleStringProperty(title);
        this.year = new SimpleIntegerProperty(year);
        this.rating = new SimpleDoubleProperty(rating);
    }

    public StringProperty getTitle() { return title; }
    public IntegerProperty getYear() { return year; }
    public DoubleProperty getRating() { return rating; }
}