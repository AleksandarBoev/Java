package com.company;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
     //   System.out.print("a=");
        int a = Integer.parseInt(console.nextLine());
    //    System.out.print("b=");
        int b = Integer.parseInt(console.nextLine());
     //   System.out.print("The area of a rectangle with sides " + a + " and " + b + " is ");
        System.out.print(a*b);
    }
}
