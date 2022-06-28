package com.magnuszakariassen.industrycoding.readability;

public class FizzBuzz {
    public static void main(String[] args) {
        doStuff(100);
    }
    public static void doStuff(int num) {
        for (int i = 1; i<= num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }

}
