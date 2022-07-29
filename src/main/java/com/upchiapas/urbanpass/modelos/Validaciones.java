package com.upchiapas.urbanpass.modelos;


import com.upchiapas.urbanpass.HelloApplication;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class Validaciones {

    static ArrayList<Taxi> listaTaxis = new ArrayList<>();
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
                guardarRegistros(laFechaPicker, posicion);
                HelloApplication.setFXML("viaje-view","viaje");
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("¡¡ERROR!!");
            alert.setContentText("El año debe ser mayor o igual al año actual");
            alert.showAndWait();
        }
    }

    public static void guardarRegistros(DatePicker myDatePicker,  int posicion) {
        posicion += 1;
        String tipo;
        LocalDate fecha = LocalDate.of(myDatePicker.getValue().getYear(), myDatePicker.getValue().getMonthValue(), myDatePicker.getValue().getDayOfMonth());
        LocalDate fechaActual = LocalDate.now();
        long dias = DAYS.between(fechaActual, fecha);
        HelloApplication.setTicket("cargando-view", "viaje", "", "a", String.valueOf(fecha));
        switch (posicion){
            case 1:
                tipo = "2255";
                Taxi taxi = new Taxi(tipo, dias);
                listaTaxis.add(taxi);
                break;
            case 2:
                tipo = "2002";
                Taxi taxi1 = new Taxi(tipo, dias);
                listaTaxis.add(taxi1);
                break;
            case 3:
                tipo = "3002";
                Taxi taxi2 = new Taxi(tipo, dias);
                listaTaxis.add(taxi2);
                break;
            case 4:
                tipo = "1212";
                Taxi taxi3 = new Taxi(tipo, dias);
                listaTaxis.add(taxi3);
                break;
        }
    }

    public static ArrayList<Taxi> getListaTaxis(){
        return listaTaxis;
    }


    public static void registroAsientos(){
        Scanner entrada = new Scanner(System.in);
        int asiento;
        System.out.println("Seleciones el asiento");
        asiento = entrada.nextInt();
    }

}
