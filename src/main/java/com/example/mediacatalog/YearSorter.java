package com.example.mediacatalog;

import java.util.ArrayList;

/**
 * A {@link Sorter} implementation that sorts {@link MediaItem} objects by their release year
 * using the {@link YearComparator}.
 */
public class YearSorter implements Sorter{
    /**
     * Sorts the provided list of media items by release year.
     * The original list is not modified; a sorted copy is returned.
     *
     * @param list the list of {@link MediaItem} objects to sort
     * @return a new {@link ArrayList} containing the media items sorted by year
     */
    @Override
    public ArrayList<MediaItem> sort(ArrayList<MediaItem> list) {
        YearComparator comparator = new YearComparator();
        ArrayList<MediaItem> copy = new ArrayList<>(list);

        copy.sort(comparator);

        return copy;
    }
}
