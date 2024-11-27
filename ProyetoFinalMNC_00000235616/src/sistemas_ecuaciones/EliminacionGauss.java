/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas_ecuaciones;

/**
 *
 * @author PC
 */
public class EliminacionGauss {

    /**
     * Metodo que realiza la operacion de la eliminacion de Gauss, utilizando la
     * matriz proporcionada por el profesor y mostrando al final el resultado de
     * x1, x2, x3 y x4
     */
    public void eliminacionGauss() {
        double[][] matriz = {
            {1, -2, 2, -3, 15},
            {3, 4, -1, 1, -6},
            {2, -3, 2, -1, 17},
            {1, 1, -3, -2, -7}
        };

        int n = matriz.length;

        // Eliminacion hacia adelante con pivoteo
        for (int i = 0; i < n; i++) {
            int maxFila = i;
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(matriz[k][i]) > Math.abs(matriz[maxFila][i])) {
                    maxFila = k;
                }
            }

            // Intercambiar filas
            double[] temp = matriz[i];
            matriz[i] = matriz[maxFila];
            matriz[maxFila] = temp;

            // Hacer ceros debajo del pivote
            for (int k = i + 1; k < n; k++) {
                double factor = matriz[k][i] / matriz[i][i];
                for (int j = i; j <= n; j++) {
                    matriz[k][j] -= factor * matriz[i][j];
                }
            }
        }

        // Sustitucion hacia atras
        double[] soluciones = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            soluciones[i] = matriz[i][n];
            for (int j = i + 1; j < n; j++) {
                soluciones[i] -= matriz[i][j] * soluciones[j];
            }
            soluciones[i] /= matriz[i][i];
        }

        // Mostrar soluciones
        System.out.println("Soluciones:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.6f\n", i + 1, soluciones[i]);
        }
    }
}
