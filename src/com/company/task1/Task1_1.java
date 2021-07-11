package com.company.task1;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert Fahrenheit to Celsius. Enter your number: ");
        double input1 = scanner.nextDouble();
        double fahrenheitTemperature = input1;
        double celsiusTemperature = 5d/9d*(fahrenheitTemperature-32);
        System.out.println("Fahrenheit = "+ fahrenheitTemperature);
        System.out.println("Celsius = "+ celsiusTemperature);

    }



}
