package task3;

import java.util.Arrays;
import java.util.Random;

public class Task1MinValue {
    public static void main(String[] args) {
        int[] mas1 = new int[10];
        Random random = new Random();

        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = random.nextInt(123);
        }
        System.out.println(Arrays.toString(mas1));

        int min = mas1[0];
        for (int i = 0; i < mas1.length; i++) {
            if (min > mas1[i]) {
                min = mas1[i];
            }
        }
        System.out.println("min = " + min);

    }
}

