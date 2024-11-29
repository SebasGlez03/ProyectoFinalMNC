/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interpolacion;

/**
 *
 * @author PC
 */
public class Cuadratica {

    /**
     * Metodo que realiza la operacion de interpolacion cuadratica con la
     * informacion de la tabla proporcionada por el profesor
     */
    public void cuardatica() {
        double[] x = {0.50, 0.55, 0.60, 0.65, 0.70, 0.75, 0.80}; // Diametro del alambre
        double[] y = {1.540, 1.863, 2.218, 2.603, 3.018, 3.465, 3.942}; // Peso por metro

        // Valor a interpolar
        double valor = 0.63;

        double resultado = 0;

        // Seleccionar tres puntos cercanos al valor
        int index = -1;
        for (int i = 0; i < x.length - 2; i++) {
            if (valor >= x[i] && valor <= x[i + 2]) {
                index = i;
                break;
            }
        }

        double x0 = x[index], x1 = x[index + 1], x2 = x[index + 2];
        double y0 = y[index], y1 = y[index + 1], y2 = y[index + 2];

        // Aplicar formula de interpolacion cuadratica
        resultado
                = y0 * ((valor - x1) * (valor - x2)) / ((x0 - x1) * (x0 - x2))
                + y1 * ((valor - x0) * (valor - x2)) / ((x1 - x0) * (x1 - x2))
                + y2 * ((valor - x0) * (valor - x1)) / ((x2 - x0) * (x2 - x1));

        // Mostrar resultado
        System.out.printf("Peso por metro lineal para diametro %.2f mm: %.6f g/m\n", valor, resultado);
    }

}
