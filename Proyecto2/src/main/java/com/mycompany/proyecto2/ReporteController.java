package com.mycompany.proyecto2;

import com.mycompany.proyecto2.App;
import com.mycompany.proyecto2.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class ReporteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void mostrarVentanaPrincipal(ActionEvent event) throws IOException {
        //se carga el fxml de nueva ventana
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Pantalla01_Menu.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        App.changeRoot(root);
    }

}
