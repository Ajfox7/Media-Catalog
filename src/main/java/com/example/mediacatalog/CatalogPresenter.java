package com.example.mediacatalog;

/**
 * The presenter class for the media catalog application.
 * Implements the {@link IMVPContract.Presenter} interface to handle adding items and sorting the media catalog.
 * It interacts with both the model (catalog) and the view to update the UI based on user actions.
 */
public class CatalogPresenter implements IMVPContract.Presenter{

    MediaCatalog catalog;
    IMVPContract.View view;
    Sorter sorter;

    /**
     * Constructs a {@code CatalogPresenter} and initializes the catalog and view.
     *
     * @param aView the view that will be updated with the media item list
     */
    public CatalogPresenter(IMVPContract.View aView){
        catalog = new MediaCatalog();
        view = aView;
    }

    /**
     * Adds a media item to the catalog and updates the view with the new list of items.
     *
     * @param item the {@link MediaItem} to be added to the catalog
     */
    @Override
    public void addItem(MediaItem item) {
        catalog.addItem(item);
        view.updateList(catalog.items);
    }

    /**
     * Sorts the list of media items based on the specified sort type (e.g., "title" or "year")
     * and updates the view with the sorted list.
     *
     * @param sortType the type of sorting to apply (e.g., "title", "year")
     */
    @Override
    public void sortList(String sortType) {
        if(sortType.equals("title")){
            sorter = new TitleSorter();
        } else if (sortType.equals("year")) {
            sorter = new YearSorter();
        }
        view.updateList(sorter.sort(catalog.items));
    }
}
