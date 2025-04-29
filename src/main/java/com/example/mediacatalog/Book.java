package com.example.mediacatalog;

public class Book extends MediaItem{
    protected String publisher;

    public Book(String title, Integer releaseYear, Double rating, String publisher){
        super(title,releaseYear,rating);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
}
