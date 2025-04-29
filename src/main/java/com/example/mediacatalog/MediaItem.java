package com.example.mediacatalog;

public abstract class MediaItem {
    protected String title;
    protected Integer releaseYear;
    protected Double rating;

    public MediaItem(String title, Integer releaseYear, Double rating){
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }
    public Integer getReleaseYear() {
        return releaseYear;
    }
    public Double getRating() {
        return rating;
    }
}
