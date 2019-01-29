package com.clc;
public class AppCalculator {

    public static void main(String[] args) {
        int x;
        int y;
        String operator;

        x = Integer.parseInt(args[0]);
        operator = args[1];
        y = Integer.parseInt(args[2]);

        if (operator.equals("+")) {
            System.out.println(new Calculator().add(x, y));
        }
        if (operator.equals("/")) {
            System.out.println(new Calculator().divide(x, y));
        }
        if (operator.equals("*")) {
            System.out.println(new Calculator().multiply(x, y));
        }
        if (operator.equals("-")) {
            System.out.println(new Calculator().subtract(x, y));
        }
}
}
