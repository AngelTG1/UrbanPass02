package com.upchiapas.urbanpass.controllers;

import com.upchiapas.urbanpass.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ManuLookController {

    @FXML
    private Button btnAContinuar;

    @FXML
    void btnContinuarOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("viaje-view", "Viaje");
    }

}