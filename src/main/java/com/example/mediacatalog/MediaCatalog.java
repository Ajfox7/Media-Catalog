package com.example.mediacatalog;

import java.util.ArrayList;

/**
 * A simple media catalog that stores a collection of {@link MediaItem} objects.
 * Provides methods to add and remove items from the catalog.
 */
public class MediaCatalog {
    protected ArrayList<MediaItem> items = new ArrayList<>();

    /**
     * Adds a media item to the catalog.
     *
     * @param item the {@link MediaItem} to be added
     */
    public void addItem(MediaItem item){
        items.add(item);
    }
    /**
     * Removes a media item from the catalog.
     *
     * @param item the {@link MediaItem} to be removed
     */
    public void removeItem(MediaItem item){
        items.remove(item);
    }
}
