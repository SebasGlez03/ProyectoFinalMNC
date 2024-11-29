/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regresion;

/**
 *
 * @author PC
 */
public class FachadaRegresion implements IRegresion {

    LinealSimple ls = new LinealSimple();
    Polinomial p = new Polinomial();
    PolinomialCubica pc = new PolinomialCubica();
    LinealMultiple lm = new LinealMultiple();

    /**
     * Metodo que obtiene el valor de la Regresion Lineal Simple
     */
    @Override
    public void linealSimple() {
        ls.linealSimple();
    }

    /**
     * Metodo que obtiene el valor de la Regresion Polinomial
     */
    @Override
    public void polinomial() {
        p.polinomial();
    }

    /**
     * Metodo que obtiene el valor de la Regresion Polinomial Cubica
     */
    @Override
    public void polinomialCubica() {
        pc.polinomialCubica();
    }

    /**
     * Metodo que obtiene el valor de la Regresion Lineal Multiple
     */
    @Override
    public void linealMultiple() {
        lm.linealMultiple();
    }

}
