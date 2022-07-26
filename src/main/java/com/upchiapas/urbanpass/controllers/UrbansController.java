package com.upchiapas.urbanpass.controllers;

import com.upchiapas.urbanpass.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class UrbansController  {

    @FXML
    private Button btnasiento1;

    @FXML
    private Button btnasiento2;

    @FXML
    private Button btnasiento3;

    @FXML
    private Button btnasiento4;

    @FXML
    private Button btnasiento5;

    @FXML
    private Button btnasiento6;

    @FXML
    private Button btnasiento7;

    @FXML
    private Label txtNumeroTaxi;


    @FXML
    private Label txtFechaSalida;


    @FXML
    private Label txtHora;

    @FXML
    void btnasiento1OnMouseClicked(MouseEvent event) {
        Button buttonTem;
        buttonTem = ((Button)event.getSource());
        //HelloApplication.newStage("registro-view", "Registro - Persona", buttonTem.getText());
        HelloApplication.setTicket("tickets-view", "Ticket-Modulo", buttonTem.getText(), txtNumeroTaxi.getText(), txtFechaSalida.getText());
        buttonTem.setDisable(true);
    }

    @FXML
    void initialize(){
        txtNumeroTaxi.setText(HelloApplication.numeroTaxi);
        txtNumeroTaxi.setText(HelloApplication.numeroTaxi);
        txtHora.setText(HelloApplication.horaSalida);
        txtFechaSalida.setText(HelloApplication.fechaSalida);
    }

}
