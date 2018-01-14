package com.company;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("a=");
        int a = Integer.parseInt(myScanner.nextLine());
        System.out.println("Square area =" + (a*a));
    }
}
