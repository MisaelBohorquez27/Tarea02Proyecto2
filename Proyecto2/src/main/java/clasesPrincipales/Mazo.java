package clasesPrincipales;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Mazo {
    //atributos

    private ArrayList<Carta> cartas;
    public String rutaArchivo = "archivos/cartasloteria.csv";
    public String rutaImagen = "src/main/resources/img/";

    //constructor
    public Mazo() {
        cartas = new ArrayList<>();
        cargarCartas();
        
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }
    
    

    public void elegirCartaAletoria() {
        
    }
    public void cargarCartas() {
        try (BufferedReader archivo = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea = null;
            while ((linea = archivo.readLine()) != null) {
                String[] datos = linea.split(",");
                Carta carta = new Carta(Integer.valueOf(datos[0]), datos[1],rutaImagen+datos[0]+".png");
                cartas.add(carta);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado!: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("IO Exception:" + ex.getMessage());
        }

    }
    
}
