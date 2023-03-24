package org.lessons;

public class Calculator {

    public static float add(float num1, float num2){
        return num1 + num2;
    }

    public static float subtract(float num1, float num2){
        return num1 - num2;
    }

    public static float divide(float num1, float num2) throws IllegalArgumentException{
        if ( num2 == 0) throw new IllegalArgumentException("A number cannot be divided by 0");
        return num1/num2;
    }

    public static float multiply(float num1, float num2){
        return num1 * num2;
    }
    private Calculator() {
    }




}
