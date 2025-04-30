package com.example.mediacatalog;

import java.util.Comparator;

public class TitleComparator implements Comparator<MediaItem> {
    @Override
    public int compare(MediaItem o1, MediaItem o2) {
        return o1.getTitle().get().compareToIgnoreCase(o2.getTitle().get());
    }
}
