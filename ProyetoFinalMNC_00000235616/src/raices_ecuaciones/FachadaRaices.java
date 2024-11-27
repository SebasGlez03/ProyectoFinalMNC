/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raices_ecuaciones;

/**
 * Fachada que se encarga de obtener el metodo a utilizar de cada clase de los
 * metodos de raices de ecuaciones
 *
 * @author PC
 */
public class FachadaRaices implements IRaices {

    Biseccion b = new Biseccion();
    FalsaPosicion fp = new FalsaPosicion();

    /**
     * Metodo que obteiene el valor de la biseccion
     *
     * @return valor de el metodo biseccion de la clase Biseccion
     */
    @Override
    public double biseccion() {
        return b.biseccion();
    }

    /**
     * Metodo que obtiene el valor de la falsa posicion
     *
     * @return valor de el metodo falsaPosicion de la clase FalsaPosicion
     */
    @Override
    public double falsaPosicion() {
        return fp.falsaPosicion();
    }

    /**
     * Metodo que obtiene el valor de newton raphson
     *
     * @return valor de el metodo newtonRaphson de la clase NewtonRaphson
     */
    @Override
    public double newtonRaphson() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Metodo que obtiene el valor de la secante
     *
     * @return valor de el metodo secante de la clase Secante
     */
    @Override
    public double secante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
