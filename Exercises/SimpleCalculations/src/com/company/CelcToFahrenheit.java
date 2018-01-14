package com.company;

import java.util.Scanner;

public class CelcToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter celcius: ");
        double celcius = Double.parseDouble(scanner.nextLine());
        double fahrenheit = celcius * 1.8 + 32;
        System.out.print(fahrenheit);
    }
}
