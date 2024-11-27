/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package raices_ecuaciones;

/**
 * Interfaz que declara todos los metodos de obtencion para la clase
 * FachadaRaices
 *
 * @author PC
 */
public interface IRaices {

    /**
     * Metodo para obtener el valor de la biseccion
     *
     * @return valor obtenido del metodo de la biseccion
     */
    public double biseccion();

    /**
     * Metodo para obtener el valor de la falsa posicion
     *
     * @return valor obtenido del metodo falsa posicion
     */
    public double falsaPosicion();

    /**
     * Metodo para obtener el valor de Newton Raphson
     *
     * @return valor obtenido del metodo Newton Raphson
     */
    public double newtonRaphson();

    /**
     * Metodo para obtener el valor de la secante
     *
     * @return valor obtenido del metodo de la secante
     */
    public double secante();

}
