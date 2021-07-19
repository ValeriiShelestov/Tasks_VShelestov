package com.company.task2;

public class Task6 {
    public static void main(String[] args) {
        int a = 1;
        int b = -1;
        double x;
        try {
            if (a == 0) {
                throw new ArithmeticException();

            } else {
                x = (double) -b / a;
                System.out.println("x = " + x);
            }
        } catch (ArithmeticException ae) {
            System.out.println("Нельзя делить на 0");

        }

    }
}

