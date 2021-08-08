package task3;

import java.util.Arrays;
import java.util.Random;

public class Task7PerevorotMassiva {
    public static void main(String[] args) {
        int[] mas = new int[]{1, 2, 3, 4, 5};

        for (int i = mas.length - 1; i >= 0; i--) {
            //mas[i]=mas[mas.length-i-1];
            System.out.print(" " + mas[i]);
        }
        System.out.println();

        int temp;
        for (int i = 0; i < mas.length / 2; i++) {
            temp = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(mas));
    }
}
