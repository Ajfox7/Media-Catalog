package com.example.mediacatalog;

import java.util.ArrayList;

/**
 * Defines the contract for the Model-View-Presenter (MVP) pattern used in the media catalog application.
 * The contract specifies the interactions between the Presenter and the View.
 */
public interface IMVPContract {
    /**
     * The Presenter interface defines the actions that the Presenter can perform.
     * It interacts with the model (e.g., adding items and sorting).
     */
    interface Presenter{
        /**
         * Adds a {@link MediaItem} to the model.
         *
         * @param item the media item to add
         */
        void addItem(MediaItem item);
        /**
         * Sorts the list of media items based on the specified sort type.
         * The sort type can refer to sorting by title or year.
         *
         * @param sortType the type of sorting (e.g., "title", "year")
         */
        void sortList(String sortType);
    }
    /**
     * The View interface defines the actions that the View can perform.
     * It is responsible for updating the UI with a list of media items.
     */
    interface View{
        /**
         * Updates the view with a new list of {@link MediaItem} objects.
         *
         * @param list the updated list of media items to display
         */
        void updateList(ArrayList<MediaItem> list);
    }
}
