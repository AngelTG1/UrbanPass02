package com.upchiapas.urbanpass.controllers;


import com.upchiapas.urbanpass.HelloApplication;
import com.upchiapas.urbanpass.modelos.Corrida;
import com.upchiapas.urbanpass.modelos.Taxi;
import com.upchiapas.urbanpass.modelos.Validaciones;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import static java.time.temporal.ChronoUnit.DAYS;

public class ViajeController implements Initializable{

    @FXML
    private Button btnAceptar;

    @FXML
    private ChoiceBox<String> elChoiceBox;


    @FXML
    private DatePicker laFechaPicker;
    private static String[] numerosTaxis = {"2255 - 07:30 am", "2002 - 08:00 am", "3002 - 08:30 am", "1212 - 09:00 am"};
    @FXML
    void btnAceptarOnMouseClicked(MouseEvent event) {
        if (elChoiceBox.getSelectionModel().getSelectedIndex() == -1){
            //se valida que el usuario seleccione una opcion de la lista del choicebox
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("¡¡ERROR!!");
            alert.setContentText("LLENE LA LISTA......");
            alert.showAndWait();
        }else {

            int lugar = elChoiceBox.getSelectionModel().getSelectedIndex();
            //int  fecha1 = laFechaPicker.getValue().getMonthValue();

            Object taxi;
            Validaciones.valirdarFecha(laFechaPicker, lugar);
            seleccionTaxi();
        }


    }


    @FXML
    void btnFechaOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void elChoiceBoxOnMouseEntered(MouseEvent event) {

    }

    @FXML
    void getFecha(ActionEvent event) {
        LocalDate elDate = laFechaPicker.getValue();
    }



    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        //se agrega el arreglo de String
        elChoiceBox.getItems().addAll(numerosTaxis);
        //obtine la posicion de la hora de salidas.


    }



    private void seleccionTaxi(){
        int numeroTaxi = elChoiceBox.getSelectionModel().getSelectedIndex(); //obtiene la posicion del array para saber la hora
        String taxi;
        switch ((numeroTaxi)){
            case 1:
                taxi = "2255";
                HelloApplication.newUrban("urbans-view", "Metodo - Asiento", taxi, "07:30 am");
                break;
            case 2:  taxi = "2002";
                HelloApplication.newUrban("urbans-view", "Metodo - Asiento", taxi ,"08:00 am");
            case 3: taxi = "3002";
                HelloApplication.newUrban("urbans-view", "Metodo - Asiento", taxi,"08:30 am" );
                break;
            case 4: taxi = "1212";
                HelloApplication.newUrban("urbans-view", "Metodo - Asiento", taxi,"09:00 am" );
                break;
        }
    }


}

