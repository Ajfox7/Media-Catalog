package com.example.mediacatalog;

import java.util.ArrayList;

public interface IMVPContract {
    interface Presenter{
        void addItem(MediaItem item);
        void sortList(String sortType);
    }
    interface View{
        void updateList(ArrayList<MediaItem> list);
    }
}
