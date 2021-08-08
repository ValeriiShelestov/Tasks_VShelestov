package task3;

import java.util.Arrays;
import java.util.Random;

public class Task3MinToMax {
    public static void main(String[] args) {
        int[] mas2 = new int[15];
        Random random = new Random();

        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = random.nextInt(123);
        }
        System.out.println(Arrays.toString(mas2));
        int min;
        for (int j = 0; j < mas2.length; j++) {
            for (int i = 1; i < mas2.length; i++) {
                if (mas2[i] < mas2[i - 1]) {
                    min = mas2[i];
                    mas2[i] = mas2[i - 1];
                    mas2[i - 1] = min;
                }
            }
        }
        System.out.println(Arrays.toString(mas2));
    }
}
