package com.example.mediacatalog;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {
    @Test
    public void sorterTest(){
        Book book = new Book("Stonewielder",2010,9.5,"Tor");
        Movie movie = new Movie("The Godfather",1972,10.0,"Francis Ford Coppola");
        ArrayList<MediaItem> list = new ArrayList<>();
        list.add(movie);
        list.add(book);
        list.add(movie);
        TitleSorter sorter = new TitleSorter();
        YearSorter sorter2 = new YearSorter();

        for(MediaItem m:list){
            System.out.println(m.getTitle());
            System.out.println(m.getYear());
        }
        ArrayList<MediaItem> list2 = sorter.sort(list);
        for(MediaItem m:list2){
            System.out.println(m.getTitle());
        }
        ArrayList<MediaItem> list3 = sorter2.sort(list);
        for(MediaItem m:list3){
            System.out.println(m.getYear());
        }
    }
}