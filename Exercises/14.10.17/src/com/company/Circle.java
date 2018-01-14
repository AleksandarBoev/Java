package com.company;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double area = Math.PI * Math.pow(r, 2);
        double perimeter = Math.PI * 2 * r;
        System.out.println("Area=" + area);
        System.out.printf("Perimeter=%f", perimeter);
    }
}
