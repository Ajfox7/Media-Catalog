package com.example.mediacatalog;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
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
    Button addButton;

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

        addButton = new Button("Add");
        addButton.setOnAction(_ -> openInputWindow());

        Label sortTypeLabel = new Label("Sort Type:");
        ComboBox<String> sortTypeComboBox = new ComboBox<>();
        sortTypeComboBox.getItems().addAll("Not Sorted","Title", "Release Year");
        sortTypeComboBox.setValue("Not Sorted");
        sortTypeComboBox.setOnAction(e -> {
            if("Title".equals(sortTypeComboBox.getValue())){
                presenter.sortList("title");
            } else if ("Release Year".equals(sortTypeComboBox.getValue())) {
                presenter.sortList("year");
            }
        });

        VBox vbox = new VBox(tableView);
        vbox.getChildren().add(addButton);
        vbox.getChildren().add(sortTypeLabel);
        vbox.getChildren().add(sortTypeComboBox);
        Scene scene = new Scene(vbox, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Media Catalog");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void updateList(ArrayList<MediaItem> list) {
        ObservableList<MediaItem> observableList = FXCollections.observableArrayList(list);
        tableView.setItems(observableList);
    }

    private void openInputWindow() {
        Stage inputStage = new Stage();
        inputStage.initModality(Modality.APPLICATION_MODAL);

        Label titleLabel = new Label("Title:");
        TextField titleField = new TextField("Enter Title");
        Label yearLabel = new Label("Release Year:");
        TextField yearField = new TextField("Enter Release Year");
        Label ratingLabel = new Label("Rating:");
        TextField ratingField = new TextField("Enter Rating");

        Label typeLabel = new Label("Type:");
        ComboBox<String> typeComboBox = new ComboBox<>();
        typeComboBox.getItems().addAll("Book", "Movie");
        typeComboBox.setValue("Book");

        Label fourthLabel = new Label("Publisher:");
        TextField fourthField = new TextField();

        typeComboBox.setOnAction(e -> {
            if ("Book".equals(typeComboBox.getValue())) {
                fourthLabel.setText("Publisher:");
            } else if("Movie".equals(typeComboBox.getValue())){
                fourthLabel.setText("Director:");
            }
        });

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            String title = titleField.getText();
            int year = Integer.parseInt(yearField.getText());
            double rating = Double.parseDouble(ratingField.getText());
            String type = typeComboBox.getValue();
            String fourthInput = fourthField.getText();

            if ("Book".equals(type)) {
                Book book = new Book(title, year, rating, fourthInput);
                presenter.addItem(book);
            } else {
                Movie movie = new Movie(title, year, rating, fourthInput);
                presenter.addItem(movie);
            }

            inputStage.close();
        });

        VBox inputLayout = new VBox(10);
        inputLayout.getChildren().addAll(
                titleLabel, titleField,
                yearLabel, yearField,
                ratingLabel, ratingField,
                typeLabel, typeComboBox,
                fourthLabel, fourthField,
                submitButton
        );

        Scene inputScene = new Scene(inputLayout, 300, 400);
        inputStage.setScene(inputScene);
        inputStage.setTitle("Add Media Item");
        inputStage.showAndWait();
    }
}
