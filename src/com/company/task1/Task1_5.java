package com.company.task1;

import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert miles to kilometres and reverse. Enter your number: ");
        double input1 = scanner.nextDouble();
        double miles = input1;
        double kilometres = miles*1.609;
        System.out.println(miles + " mile(s) = "+kilometres+" kilometre(s)");
        kilometres = input1;
        miles= kilometres/1.609;
        System.out.println(kilometres+" kilometre(s) = "+miles + " mile(s)");

    }
}