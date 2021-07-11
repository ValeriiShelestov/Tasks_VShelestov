package com.company.task1;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert Celsius to Fahrenheit. Enter your number: ");
        double input1 = scanner.nextDouble();
        double celsiusTemperature = input1;
        double fahrenheitTemperature = 9d/5d*celsiusTemperature+32;
        System.out.println("Celsius = " + celsiusTemperature);
        System.out.println("Fahrenheit = " + fahrenheitTemperature);

    }
}
//Formulas: Celsius = 5/9 (F - 32) Kelvin = C + 273.16
//9/5*C=F-32 > 9/5*C+32