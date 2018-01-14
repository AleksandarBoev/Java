package com.company;

import java.util.Scanner;

public class NumberZeroToNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String [] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if (number>=1 && number <10) {
            System.out.println(numbers[number-1]);
        } else {
            System.out.println("number too big");
        }
        //code ends here
    }
}
