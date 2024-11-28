/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas_ecuaciones;

/**
 *
 * @author PC
 */
public class MatrizInversa {

    /**
     * Metodo que realiza la operacion de la Matriz Inversa, utilizando la
     * matriz proporcionada por el profesor y mostrando al final el resultado de
     * x1, x2, x3 y x4
     */
    public void matrizInversa() {
        double[][] matriz = {
            {1, -2, 2, -3, 15},
            {3, 4, -1, 1, -6},
            {2, -3, 2, -1, 17},
            {1, 1, -3, -2, -7}
        };

        // El vector de terminos independientes (B)
        double[] b = {15, -6, 17, -7};

        int n = matriz.length;

        // Se crea la matriz identidad
        double[][] matrizIdentidad = new double[n][2 * n];

        // Se llena la parte izquierda con la matriz original y la derecha con la identidad
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizIdentidad[i][j] = matriz[i][j];
                matrizIdentidad[i][j + n] = (i == j) ? 1 : 0; // Si i es igual a j, se convierte en 1, 0 en caso contrario
            }
        }

        // Se aplica el metodo de Gauss - Jordan con pivoteo
        for (int i = 0; i < n; i++) {
            // Se encuentra el pivote (el mayor valor en la columna i)
            int maxRow = i;
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(matrizIdentidad[j][i]) > Math.abs(matrizIdentidad[maxRow][i])) {
                    maxRow = j;
                }
            }

            // Se intercambian las filas para poner el mayor valor en la diagonal
            if (maxRow != 1) {
                double[] temp = matrizIdentidad[i];
                matrizIdentidad[i] = matrizIdentidad[maxRow];
                matrizIdentidad[maxRow] = temp;
            }

            // Se hace el pivote igual a 1 dividiendo toda la fila por el valor del pivote
            double pivote = matrizIdentidad[i][i];
            for (int j = 0; j < 2 * n; j++) {
                matrizIdentidad[i][j] /= pivote;
            }

            // Se eliminan todas las otras entradas en la columna 1
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = matrizIdentidad[k][i];
                    for (int j = 0; j < 2 * n; j++) {
                        matrizIdentidad[k][j] -= factor * matrizIdentidad[i][j];
                    }
                }
            }
        }

        // Se extrae la matriz inversa de la parte derecha de la matriz identidad
        double[][] inversa = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inversa[i][j] = matrizIdentidad[i][j + n];
            }
        }

        // Se muestra la matriz inversa
        System.out.println("Matriz Inversa:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%.6f ", inversa[i][j]);
            }
            System.out.println("");
        }

        // Se multiplica la matriz inversa por el vector B para obtener el vector X (Soluciones)
        double[] x = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = 0;
            for (int j = 0; j < n; j++) {
                x[i] += inversa[i][j] * b[j];
            }
        }

        // Mostrar los valores de x1, x2, x3 y x4
        System.out.println("");
        System.out.println("Soluciones:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.6f\n", i + 1, x[i]);
        }
    }

}
