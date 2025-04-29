package com.example.mediacatalog;

import java.util.ArrayList;

public class YearSorter implements Sorter{
    @Override
    public ArrayList<MediaItem> sort(ArrayList<MediaItem> list) {
        YearComparator comparator = new YearComparator();
        ArrayList<MediaItem> copy = new ArrayList<>(list);

        copy.sort(comparator);

        return copy;
    }
}
