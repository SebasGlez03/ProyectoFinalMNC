/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import regresion.FachadaRegresion;
import regresion.IRegresion;

/**
 *
 * @author PC
 */
public class Prueba {

    public static void main(String[] args) {

        IRegresion r = new FachadaRegresion();

        r.linealSimple();
        System.out.println("-------------------------------------");
        r.polinomial();
        System.out.println("-------------------------------------");
        r.polinomialCubica();
        System.out.println("-------------------------------------");
        r.linealMultiple();

    }

}
