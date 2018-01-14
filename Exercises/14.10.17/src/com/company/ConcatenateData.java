package com.company;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
//        System.out.print("First name please: ");
        String firstName = console.nextLine();
//        System.out.print("Last name please: ");
        String lastName = console.nextLine();
//        System.out.print("Now your age please: ");
//        String ageS = scanner.nextLine();
        int age = Integer.parseInt(console.nextLine());
//        int age = Integer.parseInt(ageS);
//        System.out.print("Which town are you from?: ");
        String town = console.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);
    }
}
