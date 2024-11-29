/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regresion;

/**
 *
 * @author PC
 */
public class PolinomialCubica {

    /**
     * Metodo que realiza la operacion Regresion Polinomial Cubica con los
     * puntos xi e yi establecidos por el profesor
     */
    public void polinomialCubica() {
        double[] xi = {1, 2, 3, 4, 5, 6, 7};
        double[] yi = {0.5, 2.5, 2, 4, 3.5, 6, 5.5};

        int grado = 3; // Grado del polinomio (cubico)
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
        System.out.println("Polinomio cubico encontrado:");
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
     * Metodo que calcula la suma de las potencias de los valores de xi
     *
     * @param xi El arreglo de valores x
     * @param exponente El exponente de la potencia
     * @return La suma de las potencias
     */
    public static double sumaPotencias(double[] xi, int exponente) {
        double suma = 0;
        for (double x : xi) {
            suma += Math.pow(x, exponente);
        }
        return suma;
    }

    /**
     * Metodo que calcula la suma del producto entre las potencias de xi y los
     * valores yi
     *
     * @param xi El arreglo de valores x
     * @param yi El arreglo de valores y
     * @param exponente El exponente de la potencia
     * @return La suma del producto xi^exponente * yi
     */
    public static double sumaProducto(double[] xi, double[] yi, int exponente) {
        double suma = 0;
        for (int i = 0; i < xi.length; i++) {
            suma += Math.pow(xi[i], exponente) * yi[i];
        }
        return suma;
    }

    /**
     * Metodo que resuelve un sistema de ecuaciones lineales usando eliminacion
     * gaussiana para obtener los coeficientes del polinomio
     *
     * @param A La matriz de coeficientes del sistema de ecuaciones
     * @param B El vector de resultados
     * @return Un arreglo con los coeficientes del polinomio
     */
    public static double[] resolverSistema(double[][] A, double[] B) {
        int n = B.length;

        for (int i = 0; i < n; i++) {
            // Escalar fila para que el pivote sea 1
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
