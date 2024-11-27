/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raices_ecuaciones;

/**
 *
 * @author PC
 */
public class NewtonRaphson {

    /**
     * Metodo que obtiene la funcion de newton raphson establecida en el
     * documento del profesor
     *
     * @param x valor que obtendra del parametro
     * @return valor de la funcion realizada con el parametro obtenido
     */
    private double f(double x) {
        // Funcion: ln(x2 +1) – e^x/2 * cos(pi * x)
        return Math.log(Math.pow(x, 2) + 1) - (Math.exp(x) / 2) * Math.cos(Math.PI * x);
    }

    /**
     * Metodo que obtiene la derivada de la funcion original
     *
     * @param x valor que obtendra del parametro
     * @return valor de la derivada realizada con el parametro obtenido
     */
    private double fPrima(double x) {
        double term1 = (2 * x) / (Math.pow(x, 2) + 1); // Derivada del logaritmo
        double term2 = Math.exp(x) / 2 * (Math.cos(Math.PI * x) - Math.PI * Math.sin(Math.PI * x)); // Derivada del segundo término
        return term1 - term2;
    }

    /**
     * Metodo que realiza el Newton Raphson de la funcion establecida por el
     * profesor
     *
     * @return La raiz aproximada obtenida del metodo Newton Raphson
     */
    public double newtonRaphson() {
        double x0 = 0.7; // Valor inicial
        double tolerancia = 0.001; // Eror estimado deseado (0.1%)
        double error = Double.MAX_VALUE; // Inicializamos con un valor grande
        double x1; // Siguiente valor calculado

        while (error > tolerancia) {
            double fx = f(x0);
            double fpx = fPrima(x0);

            x1 = x0 - fx / fpx; // Formula de Newton Raphson
            error = Math.abs((x1 - x0) / x1) * 100; // Error relativo porcentual
            x0 = x1; // Actualizacion de x0 para la siguiente iteracion
        }

        return Math.abs(x0); // Devuelve la raiz aproximada
    }

}
