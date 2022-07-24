package com.upchiapas.urbanpass.modelos;


import com.upchiapas.urbanpass.HelloApplication;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Validaciones {
    public static void valirdarFecha(DatePicker laFechaPicker, int posicion){
        int currentYear = LocalDate.now().getYear();
        int currentMonth = LocalDate.now().getMonthValue();
        int currentDay = LocalDate.now().getDayOfMonth();
        if (laFechaPicker.getValue().getYear() >= currentYear) {  //evalua el año
            if (laFechaPicker.getValue().getMonthValue() < currentMonth &&  laFechaPicker.getValue().getYear() == currentYear) {  //evalua que el mes no sea menor al actual pero que el año sea el actual
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("¡¡ERROR!!");
                alert.setContentText("El mes debe ser mayor o igual al mes actual");
                alert.showAndWait();}
            else if (laFechaPicker.getValue().getDayOfMonth() < currentDay && laFechaPicker.getValue().getMonthValue() == currentMonth&&
                    laFechaPicker.getValue().getYear() == currentYear) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("¡¡ERROR!!");
                alert.setContentText("El dia debe ser mayor o igual al dia actual");
                alert.showAndWait();
            } else {
                LocalDate nose = LocalDate.now();
                long dias = DAYS.between(nose,laFechaPicker.getValue());
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Assiento");
                alert.setContentText("Lista Correcta....");
                alert.showAndWait();
                System.out.println(laFechaPicker.getValue());
                HelloApplication.setFXML("viaje-view","ss");
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("¡¡ERROR!!");
            alert.setContentText("El año debe ser mayor o igual al año actual");
            alert.showAndWait();
        }
    }
}
