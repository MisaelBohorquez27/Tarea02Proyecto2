/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesPrincipales;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Juego {

    private String fecha;
    private String duracion;
    private ArrayList<Participante> jugadores;
    private Participante ganador;
    private Configuracion configuracion;
    private Mazo mazo;
    private ArrayList<Carta> cartasJugadas;
    private Alineacion alineacion;

    public Juego() {
        Date fecha = new Date();
        this.fecha = String.valueOf(fecha.getDay() + "-" + fecha.getMonth() + "-" + fecha.getYear());
        this.mazo = new Mazo();
    }

    public Juego(String duracion, ArrayList<Participante> jugadores, Participante ganador, Configuracion configuracion, ArrayList<Carta> cartasJugadas, Alineacion alineacion) {
        this.duracion = duracion;
        this.jugadores = jugadores;
        this.ganador = ganador;
        this.configuracion = configuracion;
        this.cartasJugadas = cartasJugadas;
        this.alineacion = alineacion;
    }

    public String getDuracion() {
        return duracion;
    }

    public ArrayList<Participante> getJugadores() {
        return jugadores;
    }

    public Participante getGanadores() {
        return ganador;
    }

    public Configuracion getConfiguracion() {
        return configuracion;
    }
    
    public ArrayList<Carta> getCartaJugadas() {
        return cartasJugadas;
    }

    public Alineacion getAlineacion() {
        return alineacion;
    }
    
    public void setGanadores(Participante ganador) {
        this.ganador = ganador;
    }
    
    public void setConfiguracion(Configuracion configuracion) {
        this.configuracion = configuracion;
    }
    
    public void setCartasJugadas(ArrayList<Carta> cartasJugadas){
        this.cartasJugadas = cartasJugadas;
    }

    public void setAlineacion(Alineacion alineacion) {
        this.alineacion = alineacion;
    }

    // creación del toString
    @Override
    public String toString() {
        return "****Juego****" + " Duracion: " + duracion + " Jugadores: " + jugadores + " Ganador: " + ganador + " CartasJugadas: " + cartasJugadas + " Alineacion: " + alineacion +'}';
    }
}
