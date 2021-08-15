package com.company.task4;

import java.util.Arrays;

public class Task1PerevorotMassiva {
    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 4, 5};
        methodArraySort(mas);
    }

    public static void methodArraySort(int[] mas) {
        int temp;
        for (int i = 0; i < mas.length / 2; i++) {
            temp = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(mas));

    }
}

