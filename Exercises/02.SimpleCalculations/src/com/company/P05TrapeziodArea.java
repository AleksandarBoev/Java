package com.company;

import java.util.Scanner;

public class P05TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b1, b2, h;
        b1 = Double.parseDouble(scanner.nextLine());
        b2 = Double.parseDouble(scanner.nextLine());
        h = Double.parseDouble(scanner.nextLine());
        double result = ((b1+b2) * h) / 2.0;
        System.out.print(result);
    }
}
