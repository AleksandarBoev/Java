package com.company;

import java.util.Scanner;

public class P07RectangleArea2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double height = Math.max(x1, x2) - Math.min(x1, x2);
        double length = Math.max(y1, y2) - Math.min(y1, y2);
        double perimeter = height * length;
        double area = height * 2.0 + length * 2.0;
        System.out.println("Perimeter is: " + perimeter);
        System.out.print("Area is: " + area);
    }
}
