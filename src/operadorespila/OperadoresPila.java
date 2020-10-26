/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorespila;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class OperadoresPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner L = new Scanner(System.in);
       System.out.println("Ingresa la operacion aritmetica (solo valores de 1 digito  y expresiones infijas)");
       String infija = L.nextLine();
       String posFija = Convertidor.convierteExprecion(infija);
       String resultado = Calculador.cacularExprecion(posFija);
        System.out.println("Resultado "+resultado);n,m n,m 
    }
    
}
