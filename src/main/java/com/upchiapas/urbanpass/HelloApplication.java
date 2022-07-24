package com.upchiapas.urbanpass;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage; //conservar la variable referenciada
    private static Scene scene;
    public static String asiento;

    public static String numeroTaxi;
    public static String horaSalida;
    @Override
    public void start(Stage stage) throws IOException {

        this.stage=stage;
        //se crea la escena
        scene = new Scene(loadFXML("menulook-view"));
        stage.setTitle("holaa");
        stage.setScene(scene);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static Parent loadFXML(String nameView){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(nameView +".fxml"));
        try {
            return fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setFXML(String nameView,String title){// aqui esta delete
        //metodo para modificar la vista que esta cargando
        scene.setRoot(loadFXML(nameView));
        stage.setResizable(true);
        stage.sizeToScene(); //renderizar el tamaño del stage con las dimensiones de la nueva vista
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.setTitle(title);
    }

    public static void newUrban(String nombreView, String title, String agrs2, String agrs3){
        numeroTaxi = agrs2;
        horaSalida = agrs3;
        Stage stageTem = new Stage();
        Scene sceneTem = new Scene(loadFXML(nombreView));
        stageTem.setTitle(title);
        stageTem.setScene(sceneTem);
        stageTem.centerOnScreen();//centra la pantalla en tiempo de ejecucion
        stageTem.setResizable(false);
        stageTem.initOwner(stage);
        stageTem.initModality(Modality.WINDOW_MODAL);
        stageTem.showAndWait();
    }

    public static void setTicket(String nombreView, String tittle, String args1, String args2){
        asiento = args1;
        numeroTaxi = args2;
        Stage stageTem = new Stage();
        Scene sceneTem = new Scene(loadFXML(nombreView));
        stageTem.setTitle(tittle);
        stageTem.setScene(sceneTem);
        stageTem.centerOnScreen();//centra la pantalla en tiempo de ejecucion
        stageTem.setResizable(false);
        stageTem.initOwner(stage);
        stageTem.initModality(Modality.WINDOW_MODAL);
        stageTem.showAndWait();
    }


    public static void main(String[] args) {
        launch();
    }
}