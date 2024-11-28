/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas_ecuaciones;

/**
 *
 * @author PC
 */
public class GaussSeidel {

    /**
     * Metodo que realiza la operacion Gauss - Seidel, utilizando la matriz
     * proporcionada por el profesor y mostrando al final las iteraciones
     * realizadas con su error y el resultado de x1, x2, x3 y x4
     */
    public void gaussSeidel() {
        double[][] matriz = {
            {1, -2, 2, -3, 15},
            {3, 4, -1, 1, -6},
            {2, -3, 2, -1, 17},
            {1, 1, -3, -2, -7}
        };

        int n = matriz.length;

        // Reordenamos la matriz para hacerla diagonalmente dominante (si es posible)
        for (int i = 0; i < n; i++) {
            double max = Math.abs(matriz[i][i]);
            int maxRow = i;
            // Encontrar la fila con el mayor valor en la diagonal
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(matriz[j][i]) > max) {
                    max = Math.abs(matriz[j][i]);
                    maxRow = j;
                }
            }
            // Intercambiar filas si es necesario
            if (maxRow != i) {
                double[] temp = matriz[i];
                matriz[i] = matriz[maxRow];
                matriz[maxRow] = temp;
            }
        }

        // Valores iniciales para las variables
        double[] x = new double[n];
        double[] prevX = new double[n];

        // Criterios de convergencia
        double tolerancia = 0.001; // 0.1%
        double error = Double.MAX_VALUE;

        // Iteraciones
        int iteraciones = 0;
        System.out.println("Iteracion\tError");
        while (error > tolerancia) {
            error = 0;
            for (int i = 0; i < n; i++) {
                prevX[i] = x[i]; // Guardar el valor anterior
                double suma = matriz[i][n]; // Termino independiente
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma -= matriz[i][j] * x[j];
                    }
                }
                x[i] = suma / matriz[i][i]; // Calcular nuevo valor

                // Calcular el error relativo porcentual
                if (x[i] != 0) {
                    error = Math.max(error, Math.abs((x[i] - prevX[i]) / x[i]) * 100);
                }
            }
            iteraciones++;
            System.out.printf("  %d\t\t%.6f\n", iteraciones, error);

            // Agregar un limite maximo de iteraciones para evitar un ciclo infinito
            if (iteraciones > 1000) {
                System.out.println("Se alcanzó el límite máximo de iteraciones.");
                break;
            }
        }

        // Mostrar soluciones
        System.out.println("\nSoluciones:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.6f\n", i + 1, x[i]);
        }
    }

}
