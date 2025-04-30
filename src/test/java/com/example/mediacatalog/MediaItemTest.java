package com.example.mediacatalog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MediaItemTest {
    @Test
    public void mediaItemTest(){
        Book book = new Book("Stonewielder", 2010, 9.5, "Tor");
        Movie movie = new Movie("The Godfather", 1972, 10.0, "Francis Ford Coppola");

        assertEquals("Stonewielder", book.getTitle().get());
        assertEquals(2010, book.getYear().get());
        assertEquals(9.5, book.getRating().get(), 0.05);
        assertEquals("Tor", book.getPublisher().get());

        assertEquals("The Godfather", movie.getTitle().get());
        assertEquals(1972, movie.getYear().get());
        assertEquals(10.0, movie.getRating().get(), 0.05);
        assertEquals("Francis Ford Coppola", movie.getDirector().get());
    }

}