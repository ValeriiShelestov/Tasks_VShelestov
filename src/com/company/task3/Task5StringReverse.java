package com.company.task3;

public class Task5StringReverse {
    public static void main(String[] args) {
        String s = "1234567890";
        StringBuffer sreverse = new StringBuffer(s);
        System.out.println(sreverse.reverse());

        System.out.println(reverseString(s));
        //System.out.println(reverseString2(s));
    }

    public static String reverseString(String str) {
        String sreverse2 = "";
        for (int i = 0; i < str.length(); i++) {
            sreverse2 = str.charAt(i) + sreverse2;
        }
        return sreverse2;
    }

   /* public static String reverseString2(String str) {
        String sreverse3 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            sreverse3 = sreverse3 + str.charAt(i);
        }
        return sreverse3;
    }*/

}
