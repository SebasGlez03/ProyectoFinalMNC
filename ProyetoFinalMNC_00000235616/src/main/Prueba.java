/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import sistemas_ecuaciones.FachadaSistemas;
import sistemas_ecuaciones.ISistemas;

/**
 *
 * @author PC
 */
public class Prueba {

    public static void main(String[] args) {

        ISistemas s = new FachadaSistemas();

        s.eliminacionGauss();
        System.out.println("-------------------------------------");
        s.gaussJordan();
        System.out.println("-------------------------------------");
        s.gaussSeidel();
        System.out.println("-------------------------------------");
//        s.matrizInversa();

    }

}
