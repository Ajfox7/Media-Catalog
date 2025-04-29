package com.example.mediacatalog;

import java.util.ArrayList;

public class MediaCatalog {
    protected ArrayList<MediaItem> items = new ArrayList<>();

    public void addItem(MediaItem item){
        items.add(item);
    }
    public void removeItem(MediaItem item){
        items.remove(item);
    }
}
