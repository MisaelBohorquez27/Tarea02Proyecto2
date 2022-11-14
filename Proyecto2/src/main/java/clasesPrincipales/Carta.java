package clasesPrincipales;

public class Carta {

    //atributos de la clase
    private int numero;
    private String nombre;
    private String rutaImagen;

    //constructor
    public Carta(int numero, String nombre, String ruta) {
        this.numero = numero;
        this.nombre = nombre;
        this.rutaImagen = ruta;
    }

    //getters
    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }
   
}
