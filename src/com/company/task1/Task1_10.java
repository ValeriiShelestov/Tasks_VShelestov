package com.company.task1;

import java.util.Scanner;

public class Task1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter family revenue: ");
        int input1 = scanner.nextInt();
        int max = 50000, min = 20000;

        SubClass subClass1 = new SubClass();
        subClass1.compareInput(max, min, input1);

    }
}

class SubClass extends Task1_10 {
    public boolean compareInput(int max, int min, int input) {
        if (input > min & input < max) {
            System.out.println(true);
            return true;
        } else
            System.out.println(false);
        return false;
    }
}