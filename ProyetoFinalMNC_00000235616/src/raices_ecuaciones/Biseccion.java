/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raices_ecuaciones;

/**
 *
 * @author PC
 */
public class Biseccion {

    /**
     * Metodo que obtiene la funcion de la biseccion establecida en el documento
     * del profesor
     *
     * @param x valor que obtendra del parametro
     * @return valor de la funcion realizada con el parametro obtenido
     */
    private double f(double x) {
        // Funcion: (x^10) - 1
        return Math.pow(x, 10) - 1;
    }

    /**
     * Metodo que realiza la biseccion de la funcion establecida por el profesor
     *
     * @return La raiz aproximada obtenida del metodo biseccion
     */
    public double biseccion() {
        double a = 0.0;  // Extremo inferior
        double b = 1.0;  // Extremo superior
        double tolerancia = 0.001; // Error estimado deseado (0.1%)
        double c = a;

        while ((b - a) / 2.0 > tolerancia) {
            c = (a + b) / 2.0; // Punto medio
            if (f(c) == 0.0) {
                break; // Encontramos la raíz exacta
            } else if (f(a) * f(c) < 0) {
                b = c; // La raíz está en [a, c]
            } else {
                a = c; // La raíz está en [c, b]
            }
        }
        return Math.abs(c); // Devuelve la raíz aproximada
    }

}
