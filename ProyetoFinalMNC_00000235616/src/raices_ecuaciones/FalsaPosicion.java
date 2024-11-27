/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raices_ecuaciones;

/**
 *
 * @author PC
 */
public class FalsaPosicion {

    /**
     * Metodo que obtiene la funcion de la falsa posicion establecida en el
     * documento del profesor
     *
     * @param x valor que obtendra del parametro
     * @return valor de la funcion realizada con el parametro obtenido
     */
    private double f(double x) {
        // Funcion: f(x) = x^3 – 10x -5
        return Math.pow(x, 3) - 10 * x - 5;
    }

    /**
     * Metodo que usa la regla de la falsa posicion para solucionar la funcion
     * establecida por el profesor
     *
     * @return La raiz aproximada obtenida del metodo de falsa posicion
     */
    public double falsaPosicion() {
        double a = 0.0;  // Extremo inferior fijo
        double b = 1.0;  // Extremo superior fijo
        double tolerancia = 0.001; // Error estimado deseado (0.1%)
        double c = a;  // Punto inicial
        double cAnterior;  // Para calcular el error relativo
        double error = Double.MAX_VALUE;  // Inicializamos con un valor grande

        // Iterar hasta que el error sea menor que la tolerancia
        while (error > tolerancia) {
            cAnterior = c;
            // Calcular el punto de intersección usando la fórmula de Regla Falsa
            c = b - (f(b) * (b - a)) / (f(b) - f(a));

            if (f(c) == 0.0) {
                break; // Encontramos la raíz exacta
            } else if (f(a) * f(c) < 0) {
                b = c; // La raíz está en [a, c]
            } else {
                a = c; // La raíz está en [c, b]
            }

            // Calcular el error relativo
            error = Math.abs((c - cAnterior) / c) * 100.0;
        }

        return Math.abs(c); // Devuelve la raíz aproximada

    }

}
