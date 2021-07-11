package com.company.task1;

import java.util.Scanner;

public class Task1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert speed km/hr to mi/hr and reverse. Enter your number: ");
        double input1 = scanner.nextDouble();
        double kmHr = input1;
        double miHr = kmHr*0.6214;
        System.out.println(kmHr + " km/hr = "+miHr+" mi/hr");
        miHr = input1;
        kmHr= miHr/0.6214;
        System.out.println(miHr+" mi/hr = "+kmHr + " km/hr");

    }
}
