module com.example.mediacatalog {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mediacatalog to javafx.fxml;
    exports com.example.mediacatalog;
}