/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raices_ecuaciones;

/**
 *
 * @author PC
 */
public class Secante {

    /**
     * Metodo que obtiene la funcion de la secante establecida en el documento
     * del profesor
     *
     * @param x valor que obtendra del parametro
     * @return valor de la funcion realizada con el parametro obtenido
     */
    private double f(double x) {
        // Funcion: x^3 - 6x^2 +11x -6.1
        return Math.pow(x, 3) - 6 * Math.pow(x, 2) + 11 * x - 6.1;
    }

    /**
     * Metodo que realiza la secante de la funcion establecida por el profesor
     *
     * @return La raiz aproximada obtenida del metodo de la secante
     */
    public double secante() {
        double x0 = 0.0; // Primer valor inicial
        double x1 = 2.0; // Segundo valor inicial
        double tolerancia = 0.001; // Error estimado deseado (0.1%)
        double error = Double.MAX_VALUE; // Inicializamos con un valor grande
        double x2; // Siguiente valor calculado

        while (error > tolerancia) {
            double fx0 = f(x0);
            double fx1 = f(x1);

            // Forumla de la secante
            x2 = x1 - fx1 * (x1 - x0) / (fx1 - fx0);

            // Calculo del error relativo
            error = Math.abs((x2 - x1) / x2) * 100;

            // Actualizacion de valores
            x0 = x1;
            x1 = x2;
        }

        return Math.abs(x1); // Devuelve la raiz aproximada
    }

}
