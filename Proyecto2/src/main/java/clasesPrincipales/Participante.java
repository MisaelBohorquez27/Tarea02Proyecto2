package clasesPrincipales;

import clasesPrincipales.Tablero;
import clasesPrincipales.Tablero;

public class Participante {

    //atributos de la clase
    private String nombreUsuario;
    private Tablero tab;

    //constructor de la clase
    public Participante(String nombreUsuario, Tablero tab) {
        this.nombreUsuario = nombreUsuario;
        this.tab = tab;
    }

    //gett
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public Tablero getTab() {
        return tab;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    //creacion toString
    @Override
    public String toString() {
        return /*"******Participante******" +*/ "nombreUsuario: " + nombreUsuario;
    }
    
    public void verificarTablero(){
        
    }
}
