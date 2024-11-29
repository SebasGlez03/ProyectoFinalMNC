/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import interpolacion.FachadaInterpolacion;
import interpolacion.IInterpolacion;
import java.util.Scanner;
import raices_ecuaciones.FachadaRaices;
import raices_ecuaciones.IRaices;
import regresion.FachadaRegresion;
import regresion.IRegresion;
import sistemas_ecuaciones.FachadaSistemas;
import sistemas_ecuaciones.ISistemas;

/**
 *
 * @author PC
 */
public class Main {

    static Scanner key = new Scanner(System.in);
    static IRaices raices = new FachadaRaices();
    static ISistemas sistemas = new FachadaSistemas();
    static IRegresion regresion = new FachadaRegresion();
    static IInterpolacion interpolacion = new FachadaInterpolacion();

    public static void main(String[] args) {

        int n;
        int m;

        do {
            System.out.println("------------------------------------------");
            System.out.printf("\nPROYECTO DE METODOS NUMERICOS COMPUTACIONALES\n\n");
            System.out.printf("ALUMNO: Victor Sebastian Gonzalez Montiel\n");
            System.out.printf("ID: 00000235616\n\n");
            System.out.printf("Para escoger una unidad, digite un numero: ");
            System.out.printf("\n1_Raices de Ecuaciones");
            System.out.printf("\n2_Sistemas de Ecuaciones");
            System.out.printf("\n3_Regresion lineal");
            System.out.printf("\n4_Interpolacion");
            System.out.printf("\n5_Integracion");
            System.out.printf("\n6_Salir");
            System.out.printf("\nUnidad a escoger: ");
            n = key.nextInt();
            System.out.printf("\n------------------------------------------\n");

            switch (n) {
                case 1: // RAICES DE ECUACIONES
                    System.out.printf("RAICES DE ECUACIONES\n");
                    System.out.printf("Para escoger un metodo, digite el numero de este\n");
                    System.out.printf("1_Metodo de biseccion\n");
                    System.out.printf("2_Metodo de falsa posicion\n");
                    System.out.printf("3_Metodo de Newton - Raphson\n");
                    System.out.printf("4_Metodo de la secante\n");
                    System.out.printf("\nMetodo a escoger: \n");
                    m = key.nextInt();
                    System.out.printf("\n");
                    System.out.printf("--------------------------------------------------");
                    System.out.printf("\n");

                    switch (m) {
                        case 1: // Metodo de bisecccion.                       
                            System.out.printf("\n\nUtilizando el metodo de la biseccion con la funcion f(x) = (x^10) - 1,\n");
                            System.out.println("y utilizando el intervalo de [0, 1].");
                            System.out.println("\nSe encontro que la raiz aproximada es: " + raices.biseccion());
                            break;

                        case 2: // Metodo de falsa posicion
                            System.out.printf("\n\nUtilizando el metodo de la falsa posicion con la funcion f(x) = x^3 -10x -5,\n");
                            System.out.println("y utilizando el intervalo de [0, 1].");
                            System.out.println("\nSe encontro que la raiz aproximada es: " + raices.falsaPosicion());
                            break;

                        case 3: // Metodo de Newton - Raphson
                            System.out.printf("\n\nUtilizando el metodo de Newton Raphson con la funcion f(x) = ln(x^2 +1) - e^x/2 * cos(pi * x),\n");
                            System.out.println("y utilizando el valor inicial de 0.7");
                            System.out.println("\nSe encontro que la raiz aproximada es: " + raices.newtonRaphson());
                            break;

                        case 4: // Metodo de la secante
                            System.out.printf("\n\nUtilizando el metodo de la secante con la funcion f(x) = x^3 - 6x^2 +11x -6.1,\n");
                            System.out.println("y utilizando el intervalo de [0, 2].");
                            System.out.println("\nSe encontro que la raiz aproximada es: " + raices.secante());
                            break;

                        default:
                            break;
                    }
                    break;

                case 2: // SISTEMAS DE ECUACIONES
                    System.out.printf("SISTEMAS DE ECUACIONES\n");
                    System.out.printf("Para escoger un metodo, digite el numero de este\n");
                    System.out.printf("1_Eliminacion de Gauss\n");
                    System.out.printf("2_Gauss - Jordan\n");
                    System.out.printf("3_Gauss - Seidel\n");
                    System.out.printf("4_Matriz Inversa\n");
                    System.out.printf("\nMetodo a escoger: \n");
                    m = key.nextInt();
                    System.out.printf("\n");
                    System.out.printf("--------------------------------------------------");
                    System.out.printf("\n");

                    switch (m) {
                        case 1: // Eliminacion de Gauss
                            System.out.printf("\n\nUtilizando el metodo de eliminacion de Gauss con la matriz:\n");
                            System.out.println("""
                                               | x  - 2y + 2z - 3w | = 15
                                               | 3x + 4y -  z +  w | = -6
                                               | 2x - 3y + 2z -  w | - 17
                                               | x  +  y - 3z - 2w | = -7
                                               """);
                            System.out.printf("\nSe encontraron los siguientes valores de x1, x2, x3 y x4: \n\n");
                            sistemas.eliminacionGauss();
                            break;
                        case 2: // Gauss - Jordan
                            System.out.printf("\n\nUtilizando el metodo de Gauss - Jordan con la matriz:\n");
                            System.out.println("""
                                               | x  - 2y + 2z - 3w | = 15
                                               | 3x + 4y -  z +  w | = -6
                                               | 2x - 3y + 2z -  w | - 17
                                               | x  +  y - 3z - 2w | = -7
                                               """);
                            System.out.printf("\nSe encontraron los siguientes valores de x1, x2, x3 y x4: \n\n");
                            sistemas.gaussJordan();
                            break;
                        case 3: // Gauss - Seidel
                            System.out.printf("\n\nUtilizando el metodo de Gauss - Seidel con la matriz:\n");
                            System.out.println("""
                                               | x  - 2y + 2z - 3w | = 15
                                               | 3x + 4y -  z +  w | = -6
                                               | 2x - 3y + 2z -  w | - 17
                                               | x  +  y - 3z - 2w | = -7
                                               """);
                            System.out.printf("\nSe encontraron los siguientes valores de x1, x2, x3 y x4: \n\n");
                            sistemas.gaussSeidel();
                            break;
                        case 4: // Matriz Inversa
                            System.out.printf("\n\nUtilizando el metodo de la Matriz Inversa con la matriz:\n");
                            System.out.println("""
                                               | x  - 2y + 2z - 3w | = 15
                                               | 3x + 4y -  z +  w | = -6
                                               | 2x - 3y + 2z -  w | - 17
                                               | x  +  y - 3z - 2w | = -7
                                               """);
                            System.out.printf("\nSe encontraron los siguientes valores de x1, x2, x3 y x4: \n\n");
                            sistemas.matrizInversa();
                            break;
                        default:
                            break;
                    }
                    break;

                case 3: // REGRESION LINEAL
                    System.out.printf("REGRESION LINEAL\n");
                    System.out.printf("Para escoger un metodo, digite el numero de este\n");
                    System.out.printf("1_Regresion lineal simple\n");
                    System.out.printf("2_Regresion polinomial\n");
                    System.out.printf("3_Regresion polinomial cubica\n");
                    System.out.printf("4_Regresion lineal multiple\n");
                    System.out.printf("\nMetodo a escoger: \n");
                    m = key.nextInt();
                    System.out.printf("\n");
                    System.out.printf("--------------------------------------------------");
                    System.out.printf("\n");

                    switch (m) {
                        case 1: // Regresion lineal simple
                            System.out.printf("\n\nUtilizando el metodo de la regresion lineal simple con los puntos:\n");
                            System.out.println("""
                                               +--------+--------+
                                               |   Xi   |   Yi   |
                                               +--------+--------+
                                               |  8.00  |  6.47  |
                                               |  4.00  |  6.24  |
                                               | -4.00  |  5.72  |
                                               | -12.00 |  5.09  |
                                               | -20.00 |  4.30  |
                                               | -28.00 |  4.33  |
                                               +--------+--------+
                                               """);
                            System.out.println("Se encontro la siguiente ecuacion de la recta y las siguientes predicciones:");
                            regresion.linealSimple();
                            break;
                        case 2: // Regresion polinomial
                            System.out.printf("\n\nUtilizando el metodo de la regresion polinomial con los puntos:\n");
                            System.out.println("""
                                               +--------+--------+
                                               |   Xi   |   Yi   |
                                               +--------+--------+
                                               |   1    |   0.5  |
                                               |   2    |   2.5  |
                                               |   3    |    2   |
                                               |   4    |    4   |
                                               |   5    |  3.50  |
                                               |   6    |    6   |
                                               |   7    |   5.5  |
                                               +--------+--------+
                                               """);
                            System.out.println("Se encontraro el siguiente polinomio y las siguientes predicciones:");
                            regresion.polinomial();
                            break;
                        case 3: // Regresion polinomial cubica
                            System.out.printf("\n\nUtilizando el metodo de la regresion polinomial cubica con los puntos:\n");
                            System.out.println("""
                                               +--------+--------+
                                               |   Xi   |   Yi   |
                                               +--------+--------+
                                               |   1    |   0.5  |
                                               |   2    |   2.5  |
                                               |   3    |    2   |
                                               |   4    |    4   |
                                               |   5    |  3.50  |
                                               |   6    |    6   |
                                               |   7    |   5.5  |
                                               +--------+--------+
                                               """);
                            System.out.println("Se encontraro el siguiente polinomio y las siguientes predicciones:");
                            regresion.polinomialCubica();
                            break;
                        case 4: // Regresion lineal multiple
                            System.out.printf("\n\nUtilizando el metodo de la regresion lineal multiple con los puntos:\n");
                            System.out.println("""
                                               +---------+---------+--------+
                                               |   X2i   |   X2i   |   Yi   |
                                               +---------+---------+--------+
                                               |    0    |    0    |    5   |
                                               |    2    |    1    |   10   |
                                               |   2.5   |    2    |    9   |
                                               |    1    |    3    |    0   |
                                               |    4    |    6    |    3   |
                                               |    7    |    2    |   27   |
                                               +---------+---------+--------+
                                               """);
                            System.out.println("Se encontraron los siguientes coeficientes:");
                            regresion.linealMultiple();
                            break;
                        default:
                            break;
                    }
                    break;

                case 4: // INTERPOLACION
                    System.out.printf("INTERPOLACION\n");
                    System.out.printf("Para escoger un metodo, digite el numero de este\n");
                    System.out.printf("1_Interpolacion lineal\n");
                    System.out.printf("2_Interpolacion cuadratica\n");
                    System.out.printf("3_Interpolacion polinomica\n");
                    System.out.printf("\nMetodo a escoger: \n");
                    m = key.nextInt();
                    System.out.printf("\n");
                    System.out.printf("--------------------------------------------------");
                    System.out.printf("\n");

                    switch (m) {
                        case 1: // Interpolacion lineal
                            System.out.printf("\n\nUtilizando el metodo de la interpolacion lineal con la siguiente informacion:\n");
                            System.out.println("""
                                               +------------------+---------------------+------------------+
                                               |   Diametro del   |   Longitud del      |  Peso por metro  |
                                               |   alambre (mm)   |   kilogramo (m/kg)  |  lineal (g/m)    |
                                               +------------------+---------------------+------------------+
                                               |       0.50       |        649.35       |       1.540      |
                                               |       0.55       |        536.65       |       1.863      |
                                               |       0.60       |        450.94       |       2.218      |
                                               |       0.65       |        384.23       |       2.603      |
                                               |       0.70       |        331.30       |       3.018      |
                                               |       0.75       |        288.60       |       3.465      |
                                               |       0.80       |        253.65       |       3.942      |
                                               +------------------+---------------------+------------------+
                                               """);
                            System.out.println("Se pidio lo siguiente:");
                            System.out.println("Obtener el peso por metro lineal en la longitud del kilogramo en 580");
                            System.out.println("\nY se obtubo el siguiente resultado:");
                            interpolacion.lineal();
                            break;
                        case 2: // Interpolacion cuadratica
                            System.out.printf("\n\nUtilizando el metodo de la interpolacion cuadratica con la siguiente informacion:\n");
                            System.out.println("""
                                               +------------------+---------------------+------------------+
                                               |   Diametro del   |   Longitud del      |  Peso por metro  |
                                               |   alambre (mm)   |   kilogramo (m/kg)  |  lineal (g/m)    |
                                               +------------------+---------------------+------------------+
                                               |       0.50       |        649.35       |       1.540      |
                                               |       0.55       |        536.65       |       1.863      |
                                               |       0.60       |        450.94       |       2.218      |
                                               |       0.65       |        384.23       |       2.603      |
                                               |       0.70       |        331.30       |       3.018      |
                                               |       0.75       |        288.60       |       3.465      |
                                               |       0.80       |        253.65       |       3.942      |
                                               +------------------+---------------------+------------------+
                                               """);
                            System.out.println("Se pidio lo siguiente:");
                            System.out.println("Obtener el peso por metro lineal a un diametro de 0.63");
                            System.out.println("\nY se obtubo el siguiente resultado:");
                            interpolacion.cuadratica();
                            break;
                        case 3: // Interpolacion polinomica
                            System.out.printf("\n\nUtilizando el metodo de la interpolacion polinomica con la siguiente informacion:\n");
                            System.out.println("""
                                               +------------------+---------------------+------------------+
                                               |   Diametro del   |   Longitud del      |  Peso por metro  |
                                               |   alambre (mm)   |   kilogramo (m/kg)  |  lineal (g/m)    |
                                               +------------------+---------------------+------------------+
                                               |       0.50       |        649.35       |       1.540      |
                                               |       0.55       |        536.65       |       1.863      |
                                               |       0.60       |        450.94       |       2.218      |
                                               |       0.65       |        384.23       |       2.603      |
                                               |       0.70       |        331.30       |       3.018      |
                                               |       0.75       |        288.60       |       3.465      |
                                               |       0.80       |        253.65       |       3.942      |
                                               +------------------+---------------------+------------------+
                                               """);
                            System.out.println("Se pidio lo siguiente:");
                            System.out.println("Obtener la longitud del kilometro a un peso por metro lineal (g/m) de 2.901");
                            System.out.println("\nY se obtubo el siguiente resultado:");
                            interpolacion.polinomica();
                            break;
                        default:
                            break;
                    }
                    break;

                case 5: // INTEGRACION
                    System.out.printf("INTEGRACION\n");
                    System.out.printf("Para escoger un metodo, digite el numero de este\n");
                    System.out.printf("1_Regla del rectangulo\n");
                    System.out.printf("2_Regla del trapecio\n");
                    System.out.printf("3_Simpson 1/3\n");
                    System.out.printf("4_Simpson 3/8\n");
                    System.out.printf("\nMetodo a escoger: \n");
                    m = key.nextInt();
                    System.out.printf("\n");
                    System.out.printf("--------------------------------------------------");
                    System.out.printf("\n");

                    switch (m) {
                        case 1: // Regla del rectangulo
                            System.out.println("-- AQUI VA EL METODO DE REGLA DEL RECTANGULO --");
                            break;
                        case 2: // Regla del trapecio
                            System.out.println("-- AQUI VA EL METODO DE REGLA DEL TRAPECIO --");
                            break;
                        case 3: // Simpson 1/3
                            System.out.println("-- AQUI VA EL METODO DE SIMPSON 1/3 --");
                            break;
                        case 4: // Simpson 3/8
                            System.out.println("-- AQUI VA EL METODO DE SIMPSON 3/8 --");
                            break;
                        default:
                            break;
                    }
                    break;

            }

        } while (n != 6);

    }

}
