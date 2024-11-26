/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {

    static Scanner key = new Scanner(System.in);

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
                    switch (m) {
                        case 1: // Metodo de bisecccion.
                            System.out.println("-- AQUI VA EL METODO DE BISECCION --");
                            break;

                        case 2: // Metodo de falsa posicion
                            System.out.println("-- AQUI VA EL METODO DE FALSA POSICION --");
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
                    System.out.println("-- (PROXIMAMENTE) AQUI VA EL MENU DE SISTEMAS DE ECUACIONES");
                    break;

                case 3: // REGRESION LINEAL
                    System.out.println("-- (PROXIMAMENTE) AQUI VA EL MENU DE REGRESION LINEAL --");
                    break;

                case 4: // INTERPOLACION
                    System.out.println("-- (PROXIMAMENTE) AQUI VA EL MENU DE INTERPOLACION --");
                    break;

                case 5: // INTEGRACION
                    System.out.println("-- (PROXIMAMENTE) AQUI VA EL MENU DE INTEGRACION --");
                    break;

            }

        } while (n != 6);

    }

}
