package com.company.task1;

import java.util.Scanner;

public class Task1_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 0 if grade 1 apples are available, or 1 if unavailable: ");
        byte input1 = scanner.nextByte();
        System.out.println("Enter 0 if grade 2 apples are available, or 1 if unavailable: ");
        byte input2 = scanner.nextByte();

        boolean sort1 = input1==0;
        boolean sort2 = input2==0;
        System.out.println("grade 1 = "+ sort1 + " grade 2 = "+ sort2);
        boolean totalsort;
        if (input1 == 0 | input2==0)
        {
            totalsort = true;
            System.out.println("there are apples of at least one variety: "+ totalsort);
        }
        else {
            totalsort = false;
            System.out.println("there are apples of at least one variety: "+totalsort);
        }
    }
}
