/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteDos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         System.out.println("Ingrese el valor de la tabla:\n");
         int valorA = entrada.nextInt();
         System.out.println("Ingrese el limite de la tabla:\n");
         int valorB = entrada.nextInt();
         Operacion.presentarTabla(valorA, valorB);
         /*
         valorA = 2
         valorB = 10
         2 * 1 = 2
         2 * 2 = 4
         2 * 10 = 20
         */
     }
}
