/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorespila;

import java.util.Stack;

/**
 *
 * @author Usuario
 */
public class Convertidor {

    /**
     * Algoritmo que convierte una expresion infija a posfija
     *
     * @param expresionInfija
     * @return
     */
    //El metodo recorrera cada caracter de la exprecion comparand
    public static String convierteExprecion(String expresionInfija) {
        String salida = "";
        Stack<Character> pila = new <Character> Stack();
        for (int i = 0; i < expresionInfija.length(); i++) {
            //Extraemos el caracter de la entrada (digito por digito) y comparamos su valor 
            if (expresionInfija.charAt(i) > '0' & expresionInfija.charAt(i) <= '9') {
                //si cumple entonces es un numero
                salida = salida + ","+expresionInfija.charAt(i);
            }
            //verificamos si es un operador
            if (expresionInfija.charAt(i) >= '*' & expresionInfija.charAt(i) <= '/') {
                pila.push(expresionInfija.charAt(i));
            }
            if (expresionInfija.charAt(i) == ')') {
                salida = salida +","+ pila.pop();
            }
        }
        while(!pila.isEmpty()){
            salida=salida+","+pila.pop();
        }
        return salida;
    }
}
