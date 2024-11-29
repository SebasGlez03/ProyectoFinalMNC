/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import integracion.FachadaIntegracion;
import integracion.IIntegracion;
import interpolacion.FachadaInterpolacion;
import interpolacion.IInterpolacion;
import regresion.FachadaRegresion;
import regresion.IRegresion;

/**
 *
 * @author PC
 */
public class Prueba {

    public static void main(String[] args) {

        IIntegracion i = new FachadaIntegracion();

        i.reglaRectangulo();
        System.out.println("-------------------------------------");
//        i.reglaTrapecio();
        System.out.println("-------------------------------------");
//        i.simpsonUnTercio();
        System.out.println("-------------------------------------");
//        i.simpsonTresOctavos();

    }

}
