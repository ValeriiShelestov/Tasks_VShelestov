package com.company.task3;

import java.util.Arrays;
import java.util.Random;

public class Task8Bones {
    public static void main(String[] args) {
        int[] mas = new int[5];
        int sum = 0;
        int remain = 0;
        int totalQuantity = 20;
        for (int i = 0; i < mas.length; i++) {
            Random random = new Random();
            mas[i] = random.nextInt(6) + 1;
            sum = sum + mas[i];
            remain = totalQuantity - sum;
            if (sum == totalQuantity) {
                System.out.println("Поздравляем, вы выиграли!");
                break;
            }
            if (sum < totalQuantity) {
                System.out.println("Вы находитесь на " + sum + " клетке, вам осталось " + remain + " клеток до победы");
            } else {
                System.out.println("Вы проиграли и набрали больше 20");
                break;
            }
            if (sum < totalQuantity && i == mas.length-1) {
                System.out.println("Вы проиграли и набрали меньше 20");
                break;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
