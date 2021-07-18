package com.company.task2;

public class Task8 {
    public static void main(String[] args) {
        int numberOfSales = 6;
        if (numberOfSales > 10) {
            System.out.println("менеджер заработал бонус");
        } else {
            int salesLeft = 11 - numberOfSales;
            System.out.println("продаж осталось = " + salesLeft);
        }
    }
}
