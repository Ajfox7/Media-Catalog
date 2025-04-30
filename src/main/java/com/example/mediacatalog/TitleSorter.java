package com.example.mediacatalog;

import java.util.ArrayList;

/**
 * A {@link Sorter} implementation that sorts {@link MediaItem} objects by their titles
 * using the {@link TitleComparator}.
 */
public class TitleSorter implements Sorter {
    /**
     * Sorts the provided list of media items by title in a case-insensitive manner.
     * The original list is not modified; a sorted copy is returned.
     *
     * @param list the list of {@link MediaItem} objects to sort
     * @return a new {@link ArrayList} containing the sorted media items
     */
    @Override
    public ArrayList<MediaItem> sort(ArrayList<MediaItem> list) {
        TitleComparator comparator = new TitleComparator();
        ArrayList<MediaItem> copy = new ArrayList<>(list);

        copy.sort(comparator);

        return copy;
    }
}