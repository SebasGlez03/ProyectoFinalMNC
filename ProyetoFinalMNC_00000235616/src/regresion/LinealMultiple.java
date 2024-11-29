/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regresion;

/**
 *
 * @author PC
 */
public class LinealMultiple {

    /**
     * Metodo que realiza la operacion de Regresion Lineal Multiple con los
     * puntos x1i, xi2 e yi, establecidos por el profesor
     */
    public void linealMultiple() {
        double[] x1 = {0, 2, 2.5, 1, 4, 7};
        double[] x2 = {0, 1, 2, 3, 6, 2};
        double[] y = {5, 10, 9, 0, 3, 27};

        // Realizar la regresion polinomial cubica
        double[] coeficientes = regresionPolinomialCubica(x1, x2, y);

        // Mostrar resultados
        System.out.println("Coeficientes:");
        for (int i = 0; i < coeficientes.length; i++) {
            System.out.printf("Beta%d = %.6f\n", i, coeficientes[i]);
        }
    }

    /**
     * Funcion que realiza la regresion polinomica cubica calculando los
     * coeficientes de la regresion. Utiliza la matriz de diseño X para resolver
     * el sistema de ecuaciones XtX * beta = Xt * y
     *
     * @param x1 Valores de la primera variable independiente
     * @param x2 Valores de la segunda variable independiente
     * @param y Valores de la variable dependiente
     * @return Un arreglo con los coeficientes calculados de la regresion
     */
    public static double[] regresionPolinomialCubica(double[] x1, double[] x2, double[] y) {
        int n = x1.length;

        // Matriz de diseño X
        double[][] X = new double[n][7];
        for (int i = 0; i < n; i++) {
            X[i][0] = 1;                  // Intercepto
            X[i][1] = x1[i];             // x1
            X[i][2] = x2[i];             // x2
            X[i][3] = x1[i] * x1[i];     // x1^2
            X[i][4] = x2[i] * x2[i];     // x2^2
            X[i][5] = x1[i] * x1[i] * x1[i]; // x1^3
            X[i][6] = x2[i] * x2[i] * x2[i]; // x2^3
        }

        // Transponer X
        double[][] Xt = transponerMatriz(X);

        // Calcular Xt * X
        double[][] XtX = multiplicarMatrices(Xt, X);

        // Calcular Xt * y
        double[] Xty = multiplicarMatrizVector(Xt, y);

        // Resolver el sistema XtX * beta = Xty
        return resolverSistema(XtX, Xty);
    }

    /**
     * Metodo que transpone una matriz
     *
     * @param matriz Matriz a ser transpuesta
     * @return La matriz transpuesta
     */
    public static double[][] transponerMatriz(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        double[][] transpuesta = new double[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }

    /**
     * Metodo que multiplica dos matrices A y B
     *
     * @param A Primera matriz
     * @param B Segunda matriz
     * @return El resultado de la multiplicación de A por B
     */
    public static double[][] multiplicarMatrices(double[][] A, double[][] B) {
        int filasA = A.length;
        int columnasA = A[0].length;
        int columnasB = B[0].length;
        double[][] producto = new double[filasA][columnasB];
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    producto[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return producto;
    }

    /**
     * Metodo que multiplica una matriz por un vecto
     *
     * @param matriz Matriz a ser multiplicada
     * @param vector Vector a ser multiplicado
     * @return El resultado de la multiplicacion matriz por vector
     */
    public static double[] multiplicarMatrizVector(double[][] matriz, double[] vector) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        double[] producto = new double[filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                producto[i] += matriz[i][j] * vector[j];
            }
        }
        return producto;
    }

    /**
     * Metodo que resuelve un sistema de ecuaciones lineales utilizando el
     * método de eliminacion gaussiana
     *
     * @param A Matriz de coeficientes del sistema
     * @param b Vector de terminos constantes
     * @return El vector solución del sistema
     */
    public static double[] resolverSistema(double[][] A, double[] b) {
        int n = A.length;
        double[] x = new double[n];

        // Eliminacion Gaussiana
        for (int i = 0; i < n; i++) {
            // Pivote
            for (int k = i + 1; k < n; k++) {
                double factor = A[k][i] / A[i][i];
                for (int j = i; j < n; j++) {
                    A[k][j] -= factor * A[i][j];
                }
                b[k] -= factor * b[i];
            }
        }

        // Sustitucion hacia atras
        for (int i = n - 1; i >= 0; i--) {
            double suma = b[i];
            for (int j = i + 1; j < n; j++) {
                suma -= A[i][j] * x[j];
            }
            x[i] = suma / A[i][i];
        }

        return x;
    }

}
