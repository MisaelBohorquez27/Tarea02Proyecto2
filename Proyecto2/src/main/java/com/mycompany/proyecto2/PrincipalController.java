package com.mycompany.proyecto2;

import com.mycompany.proyecto2.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class PrincipalController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void mostrarNuevoJuego(ActionEvent event) throws IOException {
        //se carga el fxml de nueva ventana
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Pantalla02_NuevoJuego.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        App.changeRoot(root);
    }

    @FXML
    private void mostrarReporte(ActionEvent event) throws IOException {
        //se carga el fxml de nueva ventana
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Pantalla04_Reporte.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        App.changeRoot(root);
    }

    @FXML
    private void mostrarConfiguraciones(ActionEvent event) throws IOException {
        //se carga el fxml de nueva ventana
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Pantalla03_Configuraciones.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        App.changeRoot(root);
    }

}
