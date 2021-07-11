package com.company.task1;


import java.util.Scanner;

public class Task1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert kilograms to pounds and reverse. Enter your number: ");
        double input1 = scanner.nextDouble();
        double kilograms = input1;
        double pounds = kilograms*2.2046;
        System.out.println(kilograms + " kilogram(s) = "+pounds+" pound(s)");
        pounds = input1;
        kilograms= pounds/2.2046;
        System.out.println(pounds+" pound(s) = "+kilograms + " kilogram(s)");

    }
}