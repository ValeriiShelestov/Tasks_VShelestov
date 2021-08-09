package com.company.task3;

import java.util.Arrays;
import java.util.Random;

public class Task1MinValue {
    public static void main(String[] args) {
        int[] mas1 = {1, 2, 3, 4, 5, 6};
        int min = mas1[0];
        for (int i = 0; i < mas1.length; i++) {
            if (min > mas1[i]) {
                min = mas1[i];
            }
        }
        System.out.println("min = " + min);
    }
}

