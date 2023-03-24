package org.lessons;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.add(1, 332));
        System.out.println(Calculator.subtract(123, 20));
        System.out.println(Calculator.divide(123, 20));
        System.out.println(Calculator.multiply(123, 2));

        StringList sl = new StringList();

        sl.add("bho");
        sl.add("bho");
        System.out.println(sl.toString());

        sl.remove(0);
        System.out.println(sl.toString());
        sl.remove(0);
        System.out.println(sl.toString());



    }
}