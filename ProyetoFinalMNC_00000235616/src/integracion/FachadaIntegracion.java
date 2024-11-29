/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integracion;

/**
 *
 * @author PC
 */
public class FachadaIntegracion implements IIntegracion {

    Rectangulo r = new Rectangulo();

    /**
     * Metodo para obtener el valor de integracion con la regla del rectangulo
     */
    @Override
    public void reglaRectangulo() {
        r.reglaRectangulo();
    }

    /**
     * Metodo para obtener el valor de integracion con la regla del trapecio
     */
    @Override
    public void reglaTrapecio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Metodo para obtener el valor de integracion con simpson 1/3
     */
    @Override
    public void simpsonUnTercio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Metodo para obtener el valor de integracion son simpson 3/8
     */
    @Override
    public void simpsonTresOctavos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
