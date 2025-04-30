package com.example.mediacatalog;

import java.util.Comparator;

/**
 * A comparator for {@link MediaItem} objects that compares them by release year.
 */
public class YearComparator implements Comparator<MediaItem> {
    /**
     * Compares two {@link MediaItem} objects based on their release year.
     *
     * @param o1 the first media item to be compared
     * @param o2 the second media item to be compared
     * @return a negative integer, zero, or a positive integer as the release year of the first
     *         media item is less than, equal to, or greater than that of the second
     */
    @Override
    public int compare(MediaItem o1, MediaItem o2) {
        return Integer.compare(o1.getYear().get(), o2.getYear().get());
    }
}
