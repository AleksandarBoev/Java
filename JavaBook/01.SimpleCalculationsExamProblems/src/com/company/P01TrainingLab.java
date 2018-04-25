package com.company;

import java.util.Scanner;

public class P01TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Rules of entering data: 3 ≤ w ≤ l ≤ 100 Entered data is in meters");
//        System.out.print("l=");
        double l = Double.parseDouble(scanner.nextLine());
//        System.out.print("w=");
        double w = Double.parseDouble(scanner.nextLine());
//        if (w<=3 || w>=l || w>=100 || l>=100 || l<=3) { //edno ot tqh da ne e spazeno => programata spira
//            System.out.println("You have entered incorrect data!");
//            System.exit(0);
//        }
        l = l * 100;
        w = w * 100 - 100;
        double l1 = Math.floor(l / 120);
        double w1 = Math.floor(w / 70);
        double result = l1 * w1 - 3;
//        System.out.println("The number of seats is: " + result);
        System.out.println(result);
        //code ends here
    }
}
