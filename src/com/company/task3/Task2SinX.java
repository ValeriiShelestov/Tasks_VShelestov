package com.company.task3;

public class Task2SinX {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i <= 36; i++) {
            System.out.println("sin " + x + " = " + Math.sin(x));
            x = x + 10;
        }
    }
}
