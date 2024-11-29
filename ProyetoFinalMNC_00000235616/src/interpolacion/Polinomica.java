/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interpolacion;

/**
 *
 * @author PC
 */
public class Polinomica {

    /**
     * Metodo que realiza la operacion de interpolacion polinomica con la
     * informacion de la tabla proporcionada por el profesor
     */
    public void polinomica() {
        double[] x = {1.540, 1.863, 2.218, 2.603, 3.018, 3.465, 3.942}; // Peso por metro
        double[] y = {649.35, 536.65, 450.94, 384.23, 331.30, 288.60, 253.65}; // Longitud por kilogramo

        // Valor a interpolar
        double valor = 2.901;

        double resultado = 0;

        int n = x.length;

        // Aplicar formula de Lagrange
        for (int i = 0; i < n; i++) {
            double terminoLagrange = 1;
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    terminoLagrange *= (valor - x[j]) / (x[i] - x[j]);
                }
            }
            resultado += terminoLagrange * y[i];
        }

        // Mostrar resultado
        System.out.printf("Longitud del kilogramo para peso por metro %.3f g/m: %.6f m/kg\n", valor, resultado);
    }

}
