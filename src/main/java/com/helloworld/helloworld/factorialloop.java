package com.helloworld.helloworld;

public class factorialloop {

    static int factorial(int value) {
        var result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        int result1 = factorial(number);
        System.out.println("Faktorial (loop) dari " + number + " adalah " + result1);
    }

}