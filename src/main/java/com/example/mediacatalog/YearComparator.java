package com.example.mediacatalog;

import java.util.Comparator;

public class YearComparator implements Comparator<MediaItem> {
    @Override
    public int compare(MediaItem o1, MediaItem o2) {
        return Integer.compare(o1.getYear().get(), o2.getYear().get());
    }
}
