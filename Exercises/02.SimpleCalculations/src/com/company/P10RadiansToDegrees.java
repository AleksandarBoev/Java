package com.company;

import java.util.Scanner;

public class P10RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radians: ");
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 57.295779513;
        System.out.print(degrees);
    }
}
