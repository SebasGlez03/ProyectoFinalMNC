/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas_ecuaciones;

/**
 *
 * @author PC
 */
public class GaussJordan {

    /**
     * Metodo que realiza la operacion Gauss - Jordan, utilizando la matriz
     * proporcionada por el profesor y mostrando al final el resultado de x1,
     * x2, x3 y x4
     */
    public void gaussJordan() {
        double[][] matriz = {
            {1, -2, 2, -3, 15},
            {3, 4, -1, 1, -6},
            {2, -3, 2, -1, 17},
            {1, 1, -3, -2, -7}
        };

        int n = matriz.length;

        // Convertir la matriz a forma reducida por filas
        for (int i = 0; i < n; i++) {
            // Pivoteo
            int maxFila = i;
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(matriz[k][i]) > Math.abs(matriz[maxFila][i])) {
                    maxFila = k;
                }
            }

            // Intercambiar filas si es necesario
            double[] temp = matriz[i];
            matriz[i] = matriz[maxFila];
            matriz[maxFila] = temp;

            // Escalar la fila pivote para que el pivote sea 1
            double pivote = matriz[i][i];
            for (int j = 0; j <= n; j++) {
                matriz[i][j] /= pivote;
            }

            // Hacer ceros en la columna del pivote para todas las demas filas
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = matriz[k][i];
                    for (int j = 0; j <= n; j++) {
                        matriz[k][j] -= factor * matriz[i][j];
                    }
                }
            }
        }

        // Mostrar soluciones
        System.out.println("Soluciones:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.6f\n", i + 1, matriz[i][n]);
        }

    }

}
