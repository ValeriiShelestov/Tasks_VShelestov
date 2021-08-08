package task3;

import java.util.Arrays;

public class Task6Kratno2INeKratno3 {
    public static void main(String[] args) {
        int[] mas = new int[15];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = i;
        }
        System.out.println(Arrays.toString(mas));

        byte temp = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0 && mas[i] % 3 != 0) {
                System.out.println(mas[i]);
                temp++;
            }
        }
        System.out.println("кол-во элементов массива,которые делятся на 2, но не делятся на 3 = " + temp);

    }
}
