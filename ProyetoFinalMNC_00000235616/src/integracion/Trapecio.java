/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integracion;

/**
 *
 * @author PC
 */
public class Trapecio {

    /**
     * Metodo que obtiene el valor del resultado de utilizar la funcion
     * establecida por el profesor
     *
     * @param x Valor que sustituira la X de la funcion
     * @return Resultado al sustituir X en la funcion
     */
    private static double f(double x) {
        //Funcion: x^3 – 10x -5
        return Math.pow(x, 3) - 10 * x - 5;
    }

    public void reglaTrapecio() {
        // Intervalo de integracion
        double a = 0; // Limite inferior
        double b = 4; // Limite superior
        int n = 10;

        // Calcular la integral por la regla del trapecio
        double deltaX = (b - a) / n; // Ancho de cada subintervalo
        double suma = 0;

        double resultado = 0;

        // Sumar los extremos
        suma += f(a) + f(b);

        // Sumar las areas de los puntos internos
        for (int i = 1; i < n; i++) {
            double xi = a + i * deltaX;
            suma += 2 * f(xi); // Cada punto interno se multiplica por 2
        }

        // Calcular el resultado final
        resultado = (deltaX / 2) * suma;

        System.out.printf("La integral aproximada de f(x) en [%f, %f] es: %.6f\n", a, b, resultado);
    }

}
