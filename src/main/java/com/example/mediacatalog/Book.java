package com.example.mediacatalog;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Represents a book, which is a type of {@link MediaItem}.
 * In addition to the common media attributes, a book has a publisher.
 */
public class Book extends MediaItem {
    private final SimpleStringProperty publisher;

    /**
     * Constructs a {@code Book} with the specified title, release year, rating, and publisher.
     *
     * @param title     the title of the book
     * @param year      the release year of the book
     * @param rating    the rating of the book
     * @param publisher the publisher of the book
     */
    public Book(String title, int year, double rating, String publisher) {
        super(title, year, rating);
        this.publisher = new SimpleStringProperty(publisher);
    }

    /**
     * Returns the publisher property of the book.
     *
     * @return the publisher as a {@link StringProperty}
     */
    public StringProperty getPublisher() { return publisher; }
}
