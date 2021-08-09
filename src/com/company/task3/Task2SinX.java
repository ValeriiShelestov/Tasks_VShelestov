package com.company.task3;

public class Task2SinX {
    public static void main(String[] args) {
        double[] mas = new double[37];
        int x = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Math.sin(x);
            System.out.println(mas[i] + " ");
            x = x + 10;
        }
    }
}
