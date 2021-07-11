package com.company.task1;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert Celsius to Kelvin. Enter your number: ");
        double input1 = scanner.nextDouble();
        double celsiusTemperature = input1;
        double kelvinTemperature = celsiusTemperature+273.16;
        System.out.println("Celsius = " + celsiusTemperature);
        System.out.println("Kelvin = " + kelvinTemperature);

    }
}
