package com.example.mediacatalog;

import java.util.Comparator;

/**
 * A comparator for {@link MediaItem} objects that compares them by title in a case-insensitive manner.
 */
public class TitleComparator implements Comparator<MediaItem> {
    /**
     * Compares two {@link MediaItem} objects based on their titles.
     *
     * @param o1 the first media item to be compared
     * @param o2 the second media item to be compared
     * @return a negative integer, zero, or a positive integer as the first argument's title
     *         is less than, equal to, or greater than the second's, ignoring case considerations
     */
    @Override
    public int compare(MediaItem o1, MediaItem o2) {
        return o1.getTitle().get().compareToIgnoreCase(o2.getTitle().get());
    }
}
