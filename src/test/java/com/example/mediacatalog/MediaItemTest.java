package com.example.mediacatalog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MediaItemTest {
    @Test
    public void mediaItemTest(){
        Book book = new Book("Stonewielder",2010,9.5,"Tor");
        Movie movie = new Movie("The Godfather",1972,10.0,"Francis Ford Coppola");

        assertEquals("Stonewielder",book.getTitle());
        assertEquals(2010,book.getReleaseYear());
        assertEquals(9.5,book.getRating(),.05);
        assertEquals("Tor",book.getPublisher());

        assertEquals("The Godfather",movie.getTitle());
        assertEquals(1972,movie.getReleaseYear());
        assertEquals(10.0,movie.getRating(),.05);
        assertEquals("Francis Ford Coppola",movie.getDirector());
    }

}