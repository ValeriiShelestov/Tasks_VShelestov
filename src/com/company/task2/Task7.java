package com.company.task2;

public class Task7 {
    public static void main(String[] args) {
        int basicSum = 1000;
        int numberOfSales = 11;
        int revenue;
        if (numberOfSales > 10) {
            revenue = basicSum + 250;
            System.out.println("total revenue = " + revenue);
        } else System.out.println("total revenue = " + basicSum);

    }
}
