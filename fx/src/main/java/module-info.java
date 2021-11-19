module com.sau.fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sau.db.fx to javafx.fxml;
    exports com.sau.db.fx;
}