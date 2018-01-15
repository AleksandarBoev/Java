package com.company;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bitcoin = Double.parseDouble(scanner.nextLine());
        double iuan = Double.parseDouble(scanner.nextLine());
        double commision = Double.parseDouble(scanner.nextLine()) / 100;
        double leva = bitcoin * 1168 + (iuan * 0.15) * 1.76;
        double evro = leva / 1.95;
        double result = evro - evro * commision;
        System.out.println(result);
    }
}
