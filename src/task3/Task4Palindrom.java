package task3;

import java.util.Arrays;
import java.util.Random;

public class Task4Palindrom {

    public static void main(String[] args) {
        char[] arrayOfChars = "abccba".toCharArray();
        System.out.println(loop(arrayOfChars));
        if (loop(arrayOfChars)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    public static boolean loop(char[] arrayOfChars) {
        for (int i = 0; i < arrayOfChars.length / 2; i++) {
            if (arrayOfChars[i] != arrayOfChars[arrayOfChars.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
