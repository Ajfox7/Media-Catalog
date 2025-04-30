package com.example.mediacatalog;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application implements IMVPContract.View{

    IMVPContract.Presenter presenter;
    TableView<MediaItem> tableView;
    TableColumn<MediaItem, String> titleColumn;
    TableColumn<MediaItem, Number> yearColumn;
    TableColumn<MediaItem, Number> ratingColumn;
    TableColumn<MediaItem, String> publisherColumn;
    TableColumn<MediaItem, String> directorColumn;

    @Override
    public void start(Stage stage) throws IOException {
        presenter = new CatalogPresenter(this);

        tableView = new TableView<>();

        titleColumn = new TableColumn<>("Title");
        titleColumn.setCellValueFactory(cellData -> cellData.getValue().getTitle());

        yearColumn = new TableColumn<>("Year");
        yearColumn.setCellValueFactory(cellData -> cellData.getValue().getYear());

        ratingColumn = new TableColumn<>("Rating");
        ratingColumn.setCellValueFactory(cellData -> cellData.getValue().getRating());

        publisherColumn = new TableColumn<>("Publisher");
        publisherColumn.setCellValueFactory(cellData -> {
            if (cellData.getValue() instanceof Book book) {
                return book.getPublisher();
            }
            return new SimpleStringProperty("");
        });

        directorColumn = new TableColumn<>("Director");
        directorColumn.setCellValueFactory(cellData -> {
            if (cellData.getValue() instanceof Movie movie) {
                return movie.getDirector();
            }
            return new SimpleStringProperty("");
        });

        tableView.getColumns().addAll(titleColumn, yearColumn, ratingColumn, publisherColumn, directorColumn);

        VBox vbox = new VBox(tableView);
        Scene scene = new Scene(vbox, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Media Catalog");
        stage.show();

        Book book = new Book("Stonewielder", 2010, 9.5, "Tor");
        Movie movie = new Movie("The Godfather", 1972, 10.0, "Francis Ford Coppola");

        presenter.addItem(book);
        presenter.addItem(movie);
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void updateList(ArrayList<MediaItem> list) {
        ObservableList<MediaItem> observableList = FXCollections.observableArrayList(list);
        tableView.setItems(observableList);
    }
}