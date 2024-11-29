/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package integracion;

/**
 *
 * @author PC
 */
public interface IIntegracion {

    /**
     * Metodo para obtener el valor de integracion con la regla del rectangulo
     */
    public void reglaRectangulo();

    /**
     * Metodo para obtener el valor de la integracion con la regla del trapecio
     */
    public void reglaTrapecio();

    /**
     * Metodo para obtener el valor de la integracion con simpson 1/3
     */
    public void simpsonUnTercio();

    /**
     * Metodo para obtener el valor de la integracion con simpson 3/8
     */
    public void simpsonTresOctavos();
}
