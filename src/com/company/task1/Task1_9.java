package com.company.task1;

import java.util.Scanner;

public class Task1_9 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int constant = 35;

        Task1nineSubOne task1nineSubOne = new Task1nineSubOne();
        task1nineSubOne.compareAge(input1, input2, constant);
    }
}

class Task1nineSubOne extends Task1_9 {
    public boolean compareAge(int man, int woman, int avg) {
        if (man < avg & woman < avg) {
            System.out.println(true);
            return true;
        } else
            System.out.println(false);
        return false;
    }
}



        /*boolean husband;
        if (input1 <= 35)
        {
            husband = true;
            System.out.println("husband's credit approval: "+ husband);
        }
        else {
            husband = false;
            System.out.println("husband's credit approval: "+husband);
        }
        boolean wife;
        if (input2 <= 35)
        {
            wife = true;
            System.out.println("wife's credit approval: " + wife);
        }
        else {
            wife = false;
            System.out.println("wife's credit approval: " + wife);
        }



        boolean m = (input1 > input2);
        if (m)
            System.out.println(true);
        else System.out.println(false);

    }

    public boolean isALessThanB1 (int a1, int b1)
    {
        return a1 < b1;
    }
    */
