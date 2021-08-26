package com.company.task4;

public class Task2PayrollCalculation {
    public static void main(String[] args) {
        int actualWorkingHours = 160;
        double basicRate = 5;
        int years = 5;
        int numberOfSale = 13;
        double sumOfSales = 15000;
        double totalRevenue = 0;

        totalRevenue = 160 * basicRate * expRate(years) + overTime(actualWorkingHours, basicRate) + saleBonus(numberOfSale) + sumOfSales(sumOfSales);
        System.out.println("\ntotalRevenue = " + totalRevenue);
    }

    static double overTime(int hours, double rate) {
        double overTime = 0;
        if (hours > 160) {
            overTime = (hours - 160) * rate * 1.5;
            System.out.println("Extra money/overtime = " + overTime);
        } else {
            System.out.println("Extra money/overtime = " + overTime);
        }
        return overTime;
    }

    static double expRate(int years) {
        double rateCoefficient = 0;
        if (years <= 2) {
            rateCoefficient = 1;
        } else {
            if (years > 2 && years <= 4) {
                rateCoefficient = 1.2;
            } else {
                if (years > 4 && years <= 6) {
                    rateCoefficient = 1.3;
                } else {
                    rateCoefficient = 1.4;
                }
            }
        }
        System.out.println("Your rate coefficient = " + rateCoefficient);
        return rateCoefficient;
    }

    static double saleBonus(int numberOfSale) {
        double bonus = 0;
        if (numberOfSale < 10) {
            bonus = -150;
            System.out.println("Your bonus from the number of sales = " + bonus);
        } else {
            if (numberOfSale > 20) {
                bonus = 250;
                System.out.println("Your bonus from the number of sales = " + bonus);
            } else {
                System.out.println("You get nothing = " + bonus);
            }
        }
        return bonus;
    }

    static double sumOfSales(double sumOfSales) {
        double bonus = 0;
        if (sumOfSales > 15000) {
            bonus = 1000;
        }
        System.out.println("Your bonus from the amount of sales = " + bonus);
        return bonus;
    }
//    4. четвертый в зависимости от суммы продаж больше 15000 $ - тоже
//    добавляется бонус (параметры у метода - сумма продаж double, возвращаемое
//            значение double бонус за сумму продаж)
//    какой бонус тут не сказанно, взял 1000
}

