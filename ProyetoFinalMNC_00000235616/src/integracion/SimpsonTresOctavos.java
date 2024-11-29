/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integracion;

/**
 *
 * @author PC
 */
public class SimpsonTresOctavos {

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

    /**
     * Metodo que utiliza la regla de Simpson 3/8 para resolver la funcion
     * establecida por el profesor
     */
    public void simpsonTresOctavos() {
        // Intervalo de integracion
        double a = 0; // Limite inferior
        double b = 5; // Limite superior
        int n = 6; // Numero de subintervalors (debe ser multiplo de 3)

        // Calcular la integral por el metodo de Simpson 1/3
        double deltaX = (b - a) / n; // Ancho del subintervalo
        double suma = f(a) + f(b); // Primer y ultimo termino
        double sumaTresImpares = 0;
        double sumaTresPares = 0;
        double sumaDosMultiplesTres = 0;

        // Sumar los valores de la funcion en las posiciones impares, pares y multiplos de 3
        for (int i = 1; i < n; i++) {
            double x = a + i * deltaX;
            if (i % 3 == 0) { // Indices multiplos de 3
                sumaDosMultiplesTres += f(x);
            } else if (i % 2 == 1) { // Indices impares
                sumaTresImpares += f(x);
            } else { // Indices pares
                sumaTresPares += f(x);
            }
        }

        // Aplicar la formula de Simpson 3/9
        double resultado = (3 * deltaX / 8) * (suma + 3 * sumaTresImpares + 3 * sumaTresPares + 2 * sumaDosMultiplesTres);

        // Mostrar el resultado
        System.out.printf("La integral aproximada de f(x) en [%f, %f] es: %.6f\n", a, b, resultado);

    }

}
