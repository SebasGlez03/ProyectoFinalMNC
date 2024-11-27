/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import raices_ecuaciones.FachadaRaices;
import raices_ecuaciones.IRaices;

/**
 *
 * @author PC
 */
public class Pruebas {

    public static void main(String[] args) {
        IRaices raices = new FachadaRaices();

        System.out.println("Biseccion: " + raices.biseccion());
        System.out.println("Falsa posicion: " + raices.falsaPosicion());
    }

}
