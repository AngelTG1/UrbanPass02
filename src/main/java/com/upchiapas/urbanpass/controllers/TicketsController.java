package com.upchiapas.urbanpass.controllers;

import com.upchiapas.urbanpass.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TicketsController {

    @FXML
    private Label txtAsiento;

    @FXML
    private Label txtAsiento1;

    @FXML
    private Label txtHora;
    @FXML
    private Label txtHora1;

    @FXML
    private Label txtNoTaxi11;

    @FXML
    void initialize(){
        txtAsiento.setText(HelloApplication.asiento);
        txtAsiento1.setText(HelloApplication.asiento);
        txtNoTaxi11.setText(HelloApplication.numeroTaxi);
        txtHora.setText(HelloApplication.horaSalida);
        txtHora1.setText(HelloApplication.horaSalida);
    }

}
