package com.company.task2;

import com.company.task1.Task1_9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        int manAge = 27;
        int womanAge = 22;
        int constant = 35;

        SubClass3 subClass3 = new SubClass3();
        SubClass3.compareAge(manAge, womanAge, constant);
    }
}

class SubClass3 extends Task9 {
    public static boolean compareAge(int man, int woman, int avg) {
        if (woman < avg) {
            if (man < avg) {
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }
}
