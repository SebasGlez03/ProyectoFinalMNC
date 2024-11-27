/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemas_ecuaciones;

/**
 *
 * @author PC
 */
public interface ISistemas {

    /**
     * Metodo para obtener el valor de la eliminacion de Gauss
     */
    public void eliminacionGauss();

    /**
     * Metodo para obtener el valor de Gauss - Jordan
     */
    public void gaussJordan();

    /**
     * Metodo para obtener el valor de Gauss - Seidel
     */
    public void gaussSeidel();

    /**
     * Metodo para obtener el valor de la matriz inversa
     */
    public void matrizInversa();

}
