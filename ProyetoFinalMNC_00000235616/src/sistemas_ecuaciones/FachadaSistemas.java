/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas_ecuaciones;

/**
 *
 * @author PC
 */
public class FachadaSistemas implements ISistemas {

    EliminacionGauss eg = new EliminacionGauss();
    GaussJordan gj = new GaussJordan();
    GaussSeidel gs = new GaussSeidel();

    /**
     * Metodo que obtiene el valor de la eliminacion de Gauss
     */
    @Override
    public void eliminacionGauss() {
        eg.eliminacionGauss();
    }

    /**
     * Metodo que obtiene el valor de Gauss - Jordan
     */
    @Override
    public void gaussJordan() {
        gj.gaussJordan();
    }

    /**
     * Metodo que obtiene el valor de Gauss - Seidel
     */
    @Override
    public void gaussSeidel() {
        gs.gaussSeidel();
    }

    /**
     * Metodo que obtiene el valor de la matriz inversa
     */
    @Override
    public void matrizInversa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
