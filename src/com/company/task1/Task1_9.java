package com.company.task1;

import java.util.Scanner;

public class Task1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age: ");
        byte input1 = scanner.nextByte();

        byte input2 = scanner.nextByte();
        System.out.println("husband = "+ input1 + " wife = "+ input2);
        boolean husband;
        if (input1 <= 35)
        {
            husband = true;
            System.out.println("husband's credit approval: "+ husband);
        }
        else {
            husband = false;
            System.out.println("husband's credit approval: "+husband);
        }
        boolean wife;
        if (input2 <= 35)
        {
            wife = true;
            System.out.println("wife's credit approval: " + wife);
        }
        else {
            wife = false;
            System.out.println("wife's credit approval: " + wife);
        }

    }
}