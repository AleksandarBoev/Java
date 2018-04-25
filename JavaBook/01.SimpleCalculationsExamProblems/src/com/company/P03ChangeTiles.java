package com.company;

import java.util.Scanner;

public class P03ChangeTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N = Double.parseDouble(scanner.nextLine());
        double W = Double.parseDouble(scanner.nextLine());
        double L = Double.parseDouble(scanner.nextLine());
        double M = Double.parseDouble(scanner.nextLine());
        double O = Double.parseDouble(scanner.nextLine());

        double area = Math.pow(N, 2);
        double tile = W * L;
        double bench = M * O;

        double tilesNeeded = (area - bench) / tile;
        double timeNeeded = tilesNeeded * 0.2;

        System.out.println(tilesNeeded);
        System.out.println(timeNeeded);
        //code ends here
    }
}
