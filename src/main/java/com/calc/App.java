package com.calc;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
       
        System.out.println("Hello wordl");
        
        Calculadora calc = new Calculadora(5, 3);
        System.out.println("Soma: " + calc.suma());
    }
}
