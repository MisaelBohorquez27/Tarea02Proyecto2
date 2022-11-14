package com.mycompany.proyecto2;

import com.mycompany.proyecto2.App;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import clasesPrincipales.Tablero;
import clasesPrincipales.Carta;
import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class JuegoController implements Initializable {
    
    private int tiempo_subida;

    @FXML
    private transient Label tiempo;
    @FXML
    private GridPane grid;

    /**
     * Initializes the controller class.
     */
    Tablero tablero;

    public JuegoController() {
        tablero = new Tablero();//constructor llena la lista
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tiempo = new Label("00:00");
        grid = new GridPane();
        
        crearTablero();
    }

    @FXML
    private void mostrarVentanaPrincipal(ActionEvent event) throws IOException {
        //se carga el fxml de nueva ventana
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Pantalla01_Menu.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        App.changeRoot(root);
    }

    @FXML
    private void crearTablero() {
        for (int i = 0; i < tablero.getCartasJuego().size(); i++) {
            InputStream input = null;
            try {
                StackPane sp = new StackPane();
                int fila = i / 4;
                int columna = i % 4;
                input = App.class.getResource(tablero.getCartasJuego().get(i).getRutaImagen()).openStream();
                ImageView img = new ImageView(new Image(input, 100, 100, false, false));
                sp.getChildren().add(img);
                grid.add(sp, columna, fila);
                img.setOnMouseClicked(e -> {

                });
            } catch (IOException ex) {
                ex.printStackTrace();
                System.out.println("no se encuentra archivo de imagen");
            } finally {
                if (input != null) {
                    try {
                        input.close();
                    } catch (IOException ex) {
                        System.out.println("no se pudo cerrar");
                    }
                }
            }

        }

    }
    
    private class TiempoRunnable implements Runnable {

        boolean activo = true;

        @Override
        public void run() {
            tiempo_subida = 00;
            Platform.runLater(() -> {
                tiempo.setText("00:00");
            });
            while (activo) {
                try {
                    if (tiempo_subida == 0) {
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException ex) {
                }
                tiempo_subida += 1;
                Platform.runLater(() -> {
                    if (tiempo_subida == 60) {
                        tiempo.setText("01:00");
                        activo = true;
                    } else if (tiempo_subida > 60) {
                        tiempo.setText("01:" + tiempo_subida);
                    } else if (tiempo_subida == 120) {
                        tiempo.setText("02:00");
                    } else if (tiempo_subida > 120) {
                        tiempo.setText("02:" + tiempo_subida);
                    } else if (tiempo_subida == 180) {
                        tiempo.setText("03:00");
                    } else if (tiempo_subida > 180) {
                        tiempo.setText("03:" + tiempo_subida);
                    }
                });
            }
        }
    }

}
