package com.company.task2;

public class Task4PrintDayInWord {
    public static void main(String[] args) {
        int number = 0;
        switch (number) {
            case 1:
                System.out.println("Monday ");
                break;
            case 2:
                System.out.println("Tuesday ");
                break;
            case 3:
                System.out.println("Wednesday ");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday ");
                break;
            case 6:
                System.out.println("Saturday ");
                break;
            case 7:
                System.out.println("Sunday ");
                break;
            default:
                System.out.println("Not a valid day");
        }

        if (number == 1) {
            System.out.println("Monday");
        } else {
            if (number == 2) {
                System.out.println("Tuesday");
            } else {
                if (number == 3) {
                    System.out.println("Wednesday");
                } else {
                    if (number == 4) {
                        System.out.println("Thursday");
                    } else {
                        if (number == 5) {
                            System.out.println("Friday");
                        } else {
                            if (number == 6) {
                                System.out.println("Saturday");
                            } else {
                                if (number == 7) {
                                    System.out.println("Sunday ");
                                } else {
                                    System.out.println("Not a valid day");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}