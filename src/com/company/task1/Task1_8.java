package com.company.task1;

import java.util.Scanner;

public class Task1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find the percentage. Enter the number of correct answers: ");
        byte input1 = scanner.nextByte();
        byte correctAnswer = input1;
        byte totalCount = 10;
        float percentage = (float) correctAnswer/totalCount*100;
        System.out.println("number of correct answers = " + correctAnswer);
        System.out.println("Your result = " + percentage+"%");
    }
}
