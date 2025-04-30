package com.example.mediacatalog;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Book extends MediaItem {
    private final SimpleStringProperty publisher;

    public Book(String title, int year, double rating, String publisher) {
        super(title, year, rating);
        this.publisher = new SimpleStringProperty(publisher);
    }

    public StringProperty getPublisher() { return publisher; }
}
