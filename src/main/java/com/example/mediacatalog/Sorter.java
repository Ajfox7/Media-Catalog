package com.example.mediacatalog;

import java.util.ArrayList;

/**
 * Defines a strategy for sorting a list of {@link MediaItem} objects.
 * Implementations of this interface should provide a concrete sorting mechanism.
 */
public interface Sorter {
    /**
     * Sorts the given list of media items and returns the sorted list.
     *
     * @param list the list of {@link MediaItem} objects to sort
     * @return a sorted {@link ArrayList} of media items
     */
    ArrayList<MediaItem> sort(ArrayList<MediaItem> list);
}
