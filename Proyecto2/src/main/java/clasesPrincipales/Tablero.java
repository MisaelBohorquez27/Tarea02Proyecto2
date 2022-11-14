package clasesPrincipales;

import java.util.ArrayList;
import java.util.Random;

public class Tablero {

    //creacion de atributos
    private  ArrayList<Carta> cartasJuego;

    //creacion constructor
    public Tablero() {
        cartasJuego = new  ArrayList<>();
        llenarTablero();
    }

    public ArrayList<Carta> getCartasJuego() {
        return cartasJuego;
    }
    
    public void llenarTablero(){
        Mazo mazo= new Mazo();
        mazo.cargarCartas();
        ArrayList<Carta> cartas = mazo.getCartas();
        while(cartas.size()<17){
            Random rand = new Random(54);
            int n = rand.nextInt();
            cartasJuego.add(cartas.get(n));
        }
    }
    
    
}
