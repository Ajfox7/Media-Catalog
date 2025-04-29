package com.example.mediacatalog;

import java.util.Comparator;

public class YearComparator implements Comparator<MediaItem> {
    @Override
    public int compare(MediaItem o1, MediaItem o2) {
        return o1.getReleaseYear().compareTo(o2.getReleaseYear());
    }
}
