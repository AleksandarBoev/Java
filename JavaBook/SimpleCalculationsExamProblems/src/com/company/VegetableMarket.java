package com.company;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegetablePrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        int vegetableWeight = Integer.parseInt(scanner.nextLine());
        int fruitWeight = Integer.parseInt(scanner.nextLine());
        double leva1 = vegetablePrice * vegetableWeight;
        double leva2 = fruitPrice * fruitWeight;
        double evro = (leva1 + leva2) / 1.94;
        System.out.println(evro);
        //code ends here
    }
}
