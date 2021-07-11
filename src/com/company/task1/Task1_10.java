package com.company.task1;

import java.util.Scanner;

public class Task1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter family revenue: ");
        long input1 = scanner.nextLong();

        boolean revenue;
        if (input1 >20000 && input1<50000)
        {
            revenue = true;
            System.out.println("family revenue is: "+ revenue);
        }
        else {
            revenue = false;
            System.out.println("family revenue is: "+revenue);
        }


    }
}