/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integracion;

/**
 *
 * @author PC
 */
public class SimpsonUnTercio {

    /**
     * Metodo que obtiene el valor del resultado de utilizar la funcion
     * establecida por el profesor
     *
     * @param x Valor que sustituira la X de la funcion
     * @return Resultado al sustituir X en la funcion
     */
    private static double f(double x) {
        // Funcion: f(x) = x^3 – 6x^2 +11x -6.1
        return Math.pow(x, 3) - 6 * Math.pow(x, 2) + 11 * x - 6.1;
    }

    public void simpsonUnTercio() {
        // Intervalo de integracion
        double a = 0; // Limite inferior
        double b = 5; // Limite superior
        int n = 6; // Numero de subintervalos (debe ser par)

        // Calcular la integral por el metodo de Simpson 1/3
        double deltaX = (b - a) / n; // Ancho del subintervalo
        double suma = f(a) + f(b); // Primer y ultimo termino
        double sumaImpares = 0;
        double sumaPares = 0;

        // Sumar los valores en las posiciones impares y pares
        for (int i = 1; i < n; i++) {
            double x = a + i * deltaX;
            if (1 % 2 == 1) { // Indices impares
                sumaImpares += f(x);
            } else { // Indices impares
                sumaPares += f(x);
            }
        }

        // Aplicar la formula de Simpson 1/3
        double resultado = (deltaX / 3) * (suma + 4 * sumaImpares + 2 * sumaPares);

        // Mostrar el resultado
        System.out.printf("La integral aproximada de f(x) en [%f, %f] es: %.6f\n", a, b, resultado);
    }

}
