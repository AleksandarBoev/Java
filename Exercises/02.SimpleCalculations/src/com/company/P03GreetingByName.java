package com.company;

import java.util.Scanner;

public class P03GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!", name);

    }
}