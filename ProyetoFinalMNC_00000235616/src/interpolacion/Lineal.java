/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interpolacion;

/**
 *
 * @author PC
 */
public class Lineal {

    /**
     * Metodo que realiza la operacion de interpolacion lineal con la
     * informacion de la tabla proporcionada por el profesor
     */
    public void lineal() {
        double[] x = {649.35, 536.65, 450.94, 384.23, 331.30, 288.60, 253.65}; // Longitud por kilogramo
        double[] y = {1.540, 1.863, 2.218, 2.603, 3.018, 3.465, 3.942}; // Peso por metro

        // Valor a interpolar
        double valor = 580;

        double resultado = 0;

        // Encontrar el intervalo deonde se encuentra el valor
        for (int i = 0; i < x.length - 1; i++) {
            if ((valor >= x[i] && valor <= x[i + 1]) || (valor >= x[i + 1] && valor <= x[i])) {
                // Aplicar forumla de interpolacion lineal
                resultado = y[i] + (valor - x[i]) * (y[i + 1] - y[i]) / (x[i + 1] - x[i]);
            }
        }

        // Mostrar el resultado
        System.out.printf("Peso por metro lineal para longitud del kilogramo %.2f: %.6f g/m\n", valor, resultado);

    }

}
