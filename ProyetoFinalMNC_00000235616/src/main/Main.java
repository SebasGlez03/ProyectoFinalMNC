/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import raices_ecuaciones.FachadaRaices;
import raices_ecuaciones.IRaices;

/**
 *
 * @author PC
 */
public class Main {

    static Scanner key = new Scanner(System.in);
    static IRaices raices = new FachadaRaices();

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
                            System.out.println("-- AQUI VA EL METODO DE NEWTON - RAPHSON --");
                            break;

                        case 4: // Metodo de la secante
                            System.out.println("-- AQUI VA EL METODO DE LA SECANTE --");
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
                            System.out.println("-- AQUI VA EL METODO DE ELIMINACION DE GAUSS --");
                            break;
                        case 2: // Gauss - Jordan
                            System.out.println("-- AQUI VA EL METODO DE GAUSS - JORDAN --");
                            break;
                        case 3: // Gauss - Seidel
                            System.out.println("-- AQUI VA EL METODO DE GAUSS - Seidel --");
                            break;
                        case 4: // Matriz Inversa
                            System.out.println("-- AQUI VA EL METODO DE MATRIZ INVERSA --");
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
                            System.out.println("-- AQUI VA EL METODO DE REGRESION LINEAL SIMPLE --");
                            break;
                        case 2: // Regresion polinomial
                            System.out.println("-- AQUI VA EL METODO DE REGRESION POLINOMIAL --");
                            break;
                        case 3: // Regresion polinomial cubica
                            System.out.println("-- AQUI VA EL METODO DE REGRESION POLINOMIAL CUBICA --");
                            break;
                        case 4: // Regresion lineal multiple
                            System.out.println("-- AQUI VA EL METODO DE REGRESION LINEAL MULTIPLE --");
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
                            System.out.println("-- AQUI VA EL METODO DE INTERPOLACION LINEAL --");
                            break;
                        case 2: // Interpolacion cuadratica
                            System.out.println("-- AQUI VA EL METODO DE INTERPOLACION CUADRATICA--");
                            break;
                        case 3: // Interpolacion polinomica
                            System.out.println("-- AQUI VA EL METODO DE INTERPOLACION POLINOMICA --");
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
