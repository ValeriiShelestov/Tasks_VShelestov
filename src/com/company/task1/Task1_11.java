package com.company.task1;

import java.util.Scanner;

public class Task1_11 {
    public static void main(String[] args) {

        boolean sort1 = true;
        boolean sort2 = true;
        SubClass2 var20 = new SubClass2();
        var20.testCompareSorts(sort1, sort2);
    }

}

class SubClass2 extends Task1_11 {
    public boolean testCompareSorts(boolean sort1, boolean sort2) {
        if (sort1 == true | sort2 == true) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
}
