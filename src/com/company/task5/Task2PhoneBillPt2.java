package com.company.task5;

public class Task2PhoneBillPt2 {

    public static void main(String[] args) {
        double mbLeft = 13;
        int numberOfMinutesUkraine = 501;
        int numberOfSMS = 51;
        int numberOfMinutesZone1 = 20;
        int numberOfMinutesZone2 = 15;
        double tempBill, totalBill;

        tempBill = internetCalculating(mbLeft) + callsCalculation(numberOfMinutesUkraine) + smsCalculation(numberOfSMS) +
                callsRoamingZone1Calculation(numberOfMinutesZone1) + callsRoamingZone2Calculation(numberOfMinutesZone2);
        System.out.println("\ninvoice without tax = " + tempBill);
        totalBill = tempBill + tempBill * 0.07;
        System.out.printf("invoice with tax = " + "%.2f", totalBill);

    }

    static double internetCalculating(double mbLeft) {
        double netBill = 0;
        if (mbLeft > 8) {
            netBill = 50 * (mbLeft - 8) / 0.5;
            System.out.println("Your additional internet expenses = " + netBill + " uah");
        } else {
            System.out.println("Internet is free");
        }
        return netBill;
    }

    static double callsCalculation(int numberOfMinutes) {
        double phoneBill = 0;
        if (numberOfMinutes < 500) {
            phoneBill = numberOfMinutes * 0.5;
            System.out.println("Your calls bill = " + phoneBill + " uah");
        } else {
            phoneBill = (numberOfMinutes - 500) * 0.75 + 500 * 0.5;
            System.out.println("Your calls bill = " + phoneBill + " uah");
        }
        return phoneBill;
    }

    static double smsCalculation(int numberOfSms) {
        double smsBill = 0;
        if (numberOfSms < 50) {
            smsBill = numberOfSms * 1;
            System.out.println("Your sms bill = " + smsBill + " uah");
        } else {
            smsBill = (numberOfSms - 50) * 1.5 + 50 * 1;
            System.out.println("Your sms bill = " + smsBill + " uah");
        }
        return smsBill;
    }

    static double callsRoamingZone1Calculation(int numberOfMinutes) {
        double phoneBill = 0;
        phoneBill = numberOfMinutes * 1.5;
        System.out.println("Your calls bill = " + phoneBill + " uah");
        return phoneBill;
    }

    static double callsRoamingZone2Calculation(int numberOfMinutes) {
        double phoneBill = 0;
        phoneBill = numberOfMinutes * 2;
        System.out.println("Your calls bill = " + phoneBill + " uah");
        return phoneBill;
    }
}
