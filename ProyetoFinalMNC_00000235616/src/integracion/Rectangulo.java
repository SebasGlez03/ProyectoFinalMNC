/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integracion;

/**
 *
 * @author PC
 */
public class Rectangulo {

    /**
     * Metodo que obtiene el valor del resultado de utilizar la funcion
     * establecida por el profesor
     *
     * @param x Valor que sustituira la X de la funcion
     * @return Resultado al sustituir X en la funcion
     */
    private static double f(double x) {
        // Funcion: 10 + 2x – 6x^2 +5x^4
        return 10 + 2 * x - 6 * Math.pow(x, 2) + 5 * Math.pow(x, 4);
    }

    /**
     * Metodo que utiliza la regla del rectangulo para resolver la funcion
     * establecida por el profesor
     */
    public void reglaRectangulo() {
        // Intervalo de integracion
        double a = 0; // Limite inferior
        double b = 2; // Limite superior
        int n = 10; // Numero de subintervalos

        // Calcular la integral por la regla del rectangulo
        double deltaX = (b - a) / n; // Ancho de cada subintervalo
        double suma = 0;

        double resultado;

        // Calcular la suma de las areas de los rectangulos
        for (int i = 0; i < n; i++) {
            double xi = a + i * deltaX; // Punto izquierdo del subintervalo
            suma += f(xi) * deltaX; // Area del rectangulo
        }
        resultado = suma;

        System.out.printf("La integral aproximada de f(x) en [%f, %f] es: %.6f\n", a, b, resultado);
    }

}
