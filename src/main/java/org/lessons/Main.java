package org.lessons;

public class Main {
    public static void main(String[] args) {


        Calculator calc = new Calculator();
        System.out.println( calc.add(1, 332));
        System.out.println(calc.subtract(123, 20));
        System.out.println(calc.divide(123, 20));
        System.out.println(calc.multiply(123, 2));

    }
}