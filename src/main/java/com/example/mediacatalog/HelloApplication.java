package com.example.mediacatalog;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application implements IMVPContract.View{

    IMVPContract.Presenter presenter;

    @Override
    public void start(Stage stage) throws IOException {

        presenter = new CatalogPresenter(this);

        stage.setTitle("Hello!");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void updateList(ArrayList<MediaItem> list) {

    }
}