package com.example.mediacatalog;

import javafx.beans.property.*;

/**
 * Represents a generic media item with a title, release year, and rating.
 * This class serves as a base for more specific types like {@code Book} or {@code Movie}.
 */
public class MediaItem {
    private final SimpleStringProperty title;
    private final SimpleIntegerProperty year;
    private final SimpleDoubleProperty rating;

    /**
     * Constructs a MediaItem with the specified title, year, and rating.
     *
     * @param title  the title of the media item
     * @param year   the release year
     * @param rating the rating
     */
    public MediaItem(String title, int year, double rating) {
        this.title = new SimpleStringProperty(title);
        this.year = new SimpleIntegerProperty(year);
        this.rating = new SimpleDoubleProperty(rating);
    }

    /**
     * Returns the title property.
     *
     * @return the title as a {@link StringProperty}
     */
    public StringProperty getTitle() { return title; }
    /**
     * Returns the year property.
     *
     * @return the year as an {@link IntegerProperty}
     */
    public IntegerProperty getYear() { return year; }
    /**
     * Returns the rating property.
     *
     * @return the rating as a {@link DoubleProperty}
     */
    public DoubleProperty getRating() { return rating; }
}