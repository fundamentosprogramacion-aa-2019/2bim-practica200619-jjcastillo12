/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usometodos;

/**
 *
 * @author Usuario
 */
public class MisMetodos {
    
    public static double obtenerPotencia(int base, int potencia){
        double valor = Math.pow(base, potencia);
        return valor;
    }
    public static void obtenerPotenciaDos(int b, int p){
        double valor = Math.pow(b, p);
        System.out.printf("El valor de su operación es %d\n", valor);
    }
}
