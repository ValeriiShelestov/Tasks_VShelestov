package com.company.task1;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert meters to inches and reverse. Enter your number: ");
        double input1 = scanner.nextDouble();
        double meters = input1;
        double inches = meters*39.37;
        System.out.println(meters + " meter(s) = "+inches+" inch(es)");
        inches = input1;
        meters= inches/39.37;
        System.out.println(inches+" inch(es) = "+meters + " meter(s)");

    }
}