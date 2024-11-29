/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regresion;

/**
 *
 * @author PC
 */
public class LinealSimple {

    /**
     * Metodo que realiza la operacion de la Regresion Lineal Simple con los
     * puntos de xi e yi establecidos por el profesor
     */
    public void linealSimple() {
        double[] xi = {8.00, 4.00, -4.00, -12.00, -20.00, -28.00}; // Puntos de xi establecidos por el profesor en el documento
        double[] yi = {6.47, 6.24, 5.72, 5.09, 4.30, 4.33}; // Puntos de yi establecidos por el profesor en el documento

        int n = xi.length;

        // Variables para las sumas
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        // Calcular las sumas
        for (int i = 0; i < n; i++) {
            sumX += xi[i];
            sumY += yi[i];
            sumXY += xi[i] * yi[i];
            sumX2 += xi[i] * xi[i];
        }

        // Calcular pendiente (m) y ordenada al origen (b)
        double m = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double b = (sumY - m * sumX) / n;

        // Mostrar resultados
        System.out.printf("Ecuacion de la recta: %.4fx + %.4f\n", m, b);

        // Mostrar predicciones
        System.out.println("\nPredicciones:");
        for (double x : xi) {
            double yPred = m * x + b;
            System.out.printf("Para x = %.2f, y estimado = %.4f\n", x, yPred);
        }

    }

}
