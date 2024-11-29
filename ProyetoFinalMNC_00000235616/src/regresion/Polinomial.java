/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regresion;

/**
 *
 * @author PC
 */
public class Polinomial {

    /**
     * Metodo que realiza la operacion de Regresion Polinomial con los puntos xi
     * e yi establecidos por el profesor
     */
    public void polinomial() {
        double[] xi = {1, 2, 3, 4, 5, 6, 7};
        double[] yi = {0.5, 2.5, 2, 4, 3.5, 6, 5.5};

        int grado = 2; // Grado del polinomio deseado
        int n = xi.length;

        // Construir la matriz de Vandermonde y el vector b
        double[][] A = new double[grado + 1][grado + 1];
        double[] B = new double[grado + 1];

        // Calcular los elementos de la matriz A y el vector B
        for (int i = 0; i <= grado; i++) {
            for (int j = 0; j <= grado; j++) {
                A[i][j] = sumaPotencias(xi, i + j);
            }
            B[i] = sumaProducto(xi, yi, i);
        }

        // Resolver el sistema de ecuaciones lineales A * coef = B
        double[] coef = resolverSistema(A, B);

        // Mostrar el polinomio
        System.out.println("Polinomio encontrado:");
        for (int i = 0; i < coef.length; i++) {
            System.out.printf("a%d = %.6f\n", i, coef[i]);
        }

        // Mostrar predicciones
        System.out.println("\nPredicciones:");
        for (double x : xi) {
            double yPred = 0;
            for (int i = 0; i < coef.length; i++) {
                yPred += coef[i] * Math.pow(x, i);
            }
            System.out.printf("Para x = %.2f, y estimado = %.6f\n", x, yPred);
        }
    }

    /**
     * Metodo que suma las potencias de xi
     *
     * @param xi Arreglo de puntos dado
     * @param exponente Exponente por el que se elevara el valor del punto
     * @return Suma de todos los elementos del arreglo con su exponente dado
     */
    public double sumaPotencias(double[] xi, int exponente) {
        double suma = 0;
        for (double x : xi) {
            suma += Math.pow(x, exponente);
        }
        return suma;
    }

    /**
     * Metodo realiza la suma del producto de xi^exponente * yi
     *
     * @param xi Arreglo de puntos dado en x
     * @param yi Arreglo de puntos dado en y
     * @param exponente Exponente por el que se elevara el valor de los puntos x
     * @return Suma del producto de xi^exponente * yi
     */
    public double sumaProducto(double[] xi, double[] yi, int exponente) {
        double suma = 0;
        for (int i = 0; i < xi.length; i++) {
            suma += Math.pow(xi[i], exponente) * yi[i];
        }
        return suma;
    }

    /**
     * Metodo que se encarga en resolver el sistema lineal usando la eliminacion
     * de Gauss
     *
     * @param A Matriz de Vandermonde
     * @param B Vector B
     * @return Matriz tras realizar la eliminacion de Gauss
     */
    public double[] resolverSistema(double[][] A, double[] B) {
        int n = B.length;

        for (int i = 0; i < n; i++) {
            // Escalar fila para que pivote sea 1
            double factor = A[i][i];
            for (int j = 0; j < n; j++) {
                A[i][j] /= factor;
            }
            B[i] /= factor;

            // Hacer ceros debajo del pivote
            for (int k = i + 1; k < n; k++) {
                factor = A[k][i];
                for (int j = 0; j < n; j++) {
                    A[k][j] -= factor * A[i][j];
                }
                B[k] -= factor * B[i];
            }
        }

        // Sustitucion hacia atras
        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            x[i] = B[i];
            for (int j = i + 1; j < n; j++) {
                x[i] -= A[i][j] * x[j];
            }
        }
        return x;
    }

}
