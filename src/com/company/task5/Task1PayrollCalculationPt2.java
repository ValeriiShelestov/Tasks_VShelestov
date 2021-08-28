package com.company.task5;

public class Task1PayrollCalculationPt2 {
    public static void main(String[] args) {
        int actualWorkingHours = 180;
        double basicRate = 5;
        int years = 5;
        int numberOfSale = 13;
        double sumOfSales = 15000;
        double totalRevenue = 0;

        SalesAgentSalary salesAgentSalary = new SalesAgentSalary(actualWorkingHours, basicRate);

    }


}

class SalesAgentSalary {

    public SalesAgentSalary(int hours, double rate) {
        baseHoursAndOverTime(hours, rate);
    }

    public SalesAgentSalary(int hours, double rate, int years, int numberOfSale, double sumOfSales) {
        double v = baseHoursAndOverTime(hours, rate) + saleBonus(numberOfSale) + sumOfSales(sumOfSales);
    }

    double baseHoursAndOverTime(int hours, double rate) {
        double overTime = 0;
        double revenue;
        if (hours > 160) {
            overTime = (hours - 160) * rate * 1.5;
            revenue = overTime + 160 * rate;
            System.out.println("Revenue with overtime = " + revenue);
        } else {
            revenue = hours * rate;
            System.out.println("Revenue without overtime = " + revenue);
        }
        return overTime;
    }

    double expRate(int years) {
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

    double saleBonus(int numberOfSale) {
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

    double sumOfSales(double sumOfSales) {
        double bonus = 0;
        if (sumOfSales > 15000) {
            bonus = 1000;
        }
        System.out.println("Your bonus from the amount of sales = " + bonus);
        return bonus;
    }
}
