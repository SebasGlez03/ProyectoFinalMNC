/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interpolacion;

/**
 *
 * @author PC
 */
public class FachadaInterpolacion implements IInterpolacion {

    Lineal l = new Lineal();
    Cuadratica c = new Cuadratica();
    Polinomica p = new Polinomica();

    public FachadaInterpolacion() {
    }

    /**
     * Metodo que obtiene el valor de interpolacion lineal
     */
    @Override
    public void lineal() {
        l.lineal();
    }

    /**
     * Metodo que obtiene el valor de interpolacion cuadratica
     */
    @Override
    public void cuadratica() {
        c.cuardatica();
    }

    /**
     * Metodo que obtiene el valor de interplacion cuadratica
     */
    @Override
    public void polinomica() {
        p.polinomica();
    }

}
