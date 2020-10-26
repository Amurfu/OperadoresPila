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
public class Calculador {

    public static  String cacularExprecion(String exprecion) {
        
        exprecion = exprecion.substring(1);
        String[] post = exprecion.split(",");   
        
        
        Stack<String> E = new Stack< String>(); //Pila entrada
        Stack<String> P = new Stack< String>(); //Pila de operandos

        //Añadir post (array) a la Pila de entrada (E)
        for (int i = post.length - 1; i >= 0; i--) {
            E.push(post[i]);
        }
        //Algoritmo de Evaluación Postfija
        String operadores = "+-*/%";
        while (!E.isEmpty()) {
            if (operadores.contains(E.peek())) {
                P.push(evaluar(E.pop(), P.pop(), P.pop()) + "");
            } else {
                P.push(E.pop());
            }
        }
        System.out.println("Expresion: " + exprecion);
        return P.peek();
    }

    private static int evaluar(String op, String n2, String n1) {
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);

        switch (op) {
            case "+":
                return (num1 + num2);
            case "-":
                return (num1 - num2);
            case "*":
                return (num1 * num2);
            case "/":
                return (num1 / num2);
            case "%":
                return (num1 % num2);
            default:
                return 0;

        }
    }
}
