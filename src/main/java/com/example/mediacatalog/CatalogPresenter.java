package com.example.mediacatalog;

public class CatalogPresenter implements IMVPContract.Presenter{

    MediaCatalog catalog;
    IMVPContract.View view;
    Sorter sorter;

    public CatalogPresenter(IMVPContract.View aView){
        catalog = new MediaCatalog();
        view = aView;
    }

    @Override
    public void addItem(MediaItem item) {
        catalog.addItem(item);
        view.updateList(catalog.items);
    }

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
