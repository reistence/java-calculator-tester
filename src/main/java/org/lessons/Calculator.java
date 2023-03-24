package org.lessons;

public class Calculator {

    public float add(float num1, float num2){
        return num1 + num2;
    }

    public float subtract(float num1, float num2){
        return num1 - num2;
    }

    public float divide(float num1, float num2) throws IllegalArgumentException{
        if ( num2 == 0) throw new IllegalArgumentException("A number cannot be divided by 0");
        return num1/num2;
    }

    public float multiply(float num1, float num2){
        return num1 * num2;
    }
    public Calculator() {
    }




}
