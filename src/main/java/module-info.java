module com.upchiapas.urbanpass {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.upchiapas.urbanpass to javafx.fxml;
    exports com.upchiapas.urbanpass;
    exports com.upchiapas.urbanpass.controllers;
    opens com.upchiapas.urbanpass.controllers to javafx.fxml;
}