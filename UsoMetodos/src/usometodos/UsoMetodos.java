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
public class UsoMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1 = 10;
        int valor2 = 2;
        double resultado = MisMetodos.obtenerPotencia(valor1, valor2);
        System.out.printf("El resultado es: %.2f\n", resultado);
        MisMetodos.obtenerPotenciaDos(valor1, valor2);

    }

}
