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

    public void gaussSeidel() {
        // La matriz se reordena para hacerla diagonalmente dominante
        double[][] matriz = {
            {3, 4, -1, 1, -6},
            {2, -3, 2, -1, 17},
            {1, -2, 2, -3, 15},
            {1, 1, -3, -2, -7}
        };

        int n = matriz.length;

        // Valores iniciales para las variables
        double[] x = new double[n];
        double[] prevX = new double[n];

        // Criterios de convergencia
        double tolerancia = 0.001; // 0.1%
        double error = Double.MAX_VALUE;

        // Iteraciones
        int iteraciones = 0;
        System.out.println("Iteración\tError");
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
        }

        // Mostrar soluciones
        System.out.println("\nSoluciones:");
        for (int i = 0; i < n; i++) {
            if (i > 50) {
                break;
            }
            System.out.printf("x%d = %.6f\n", i + 1, x[i]);
        }
    }

}
