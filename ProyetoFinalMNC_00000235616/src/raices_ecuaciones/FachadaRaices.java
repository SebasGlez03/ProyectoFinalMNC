/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raices_ecuaciones;

/**
 *
 * @author PC
 */
public class FachadaRaices implements IRaices {

    Biseccion b = new Biseccion();
    FalsaPosicion fp = new FalsaPosicion();

    @Override
    public double biseccion() {
        return b.biseccion();
    }

    @Override
    public double falsaPosicion() {
        return fp.falsaPosicion();
    }

    @Override
    public double newtonRaphson() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double secante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
