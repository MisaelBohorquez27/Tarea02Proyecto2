/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesPrincipales;

/**
 *
 * @author PC
 */
public class Configuracion {
    private boolean visible;
    private int numOponentes = 1;

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void setNumOponentes(int numOponentes) {
        this.numOponentes = numOponentes;
    }

    public boolean isVisible() {
        return visible;
    }

    public int getNumOponentes() {
        return numOponentes;
    }
}
