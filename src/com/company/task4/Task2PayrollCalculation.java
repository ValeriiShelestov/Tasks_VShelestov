package com.company.task4;

public class Task2PayrollCalculation {
    public static void main(String[] args) {
        int basicWorkingHours = 160;
        int actualWorkingHours = 200;
        double overtimeRate = 1.5;
        int years = 5;
        int numberOfSale = 23;
        double totalRevenue;


        totalRevenue = basicWorkingHours * expRate(years) + overTime(actualWorkingHours, overtimeRate) + saleBonus(numberOfSale) + sumOfSales(111111);
        System.out.println("\ntotalRevenue = " + totalRevenue);
    }

    static double overTime(int hours, double rate) {
        double overTime = 0;
        if (hours > 160) {
            overTime = (hours - 160) * rate;
            System.out.println("Extra money = " + overTime);
        } else {
            System.out.println("Extra money = " + overTime);
        }
        return overTime;
    }

    static double expRate(int years) {
        double rate = 0;
        if (years <= 2) {
            rate = 1;
        } else {
            if (years > 2 && years <= 4) {
                rate = 1.2;
            } else {
                if (years > 4 && years <= 6) {
                    rate = 1.3;
                } else {
                    rate = 1.4;
                }
            }
        }
        System.out.println("Your rate = " + rate);
        return rate;
    }

    static double saleBonus(int numberOfSale) {
        double bonus = 0;
        if (numberOfSale < 10) {
            bonus = -150;
            System.out.println("you get a bill " + bonus);
        } else {
            if (numberOfSale > 20) {
                bonus = 250;
                System.out.println("you get bonus " + bonus);
            } else {
                System.out.println("you get nothing " + bonus);
            }
        }
        return bonus;
    }

    static double sumOfSales(double sumOfSales) {
        double bonus = 0;
        if (sumOfSales > 15000) {
            bonus = 1000;
        }
        return bonus;
    }
//    4. четвертый в зависимости от суммы продаж больше 15000 $ - тоже
//    добавляется бонус (параметры у метода - сумма продаж double, возвращаемое
//            значение double бонус за сумму продаж)
//    какой бонус тут не сказанно, взял 1000
}

