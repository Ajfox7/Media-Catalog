package com.example.mediacatalog;

import java.util.ArrayList;

public class TitleSorter implements Sorter {
    @Override
    public ArrayList<MediaItem> sort(ArrayList<MediaItem> list) {
        TitleComparator comparator = new TitleComparator();
        ArrayList<MediaItem> copy = new ArrayList<>(list);

        copy.sort(comparator);

        return copy;
    }
}