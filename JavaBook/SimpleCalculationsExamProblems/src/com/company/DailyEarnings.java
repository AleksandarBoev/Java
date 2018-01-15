package com.company;

import java.util.Scanner;

public class DailyEarnings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int workDays = Integer.parseInt(scanner.nextLine());
        double earnedCash = Double.parseDouble(scanner.nextLine());
        double USDtoBGN = Double.parseDouble(scanner.nextLine());
        double salaryMonth = workDays * earnedCash;
        double salaryYear = 12 * salaryMonth + 2.5 * salaryMonth;
        double afterTaxes = salaryYear - salaryYear * 0.25;

        System.out.printf("%.2f", (afterTaxes * USDtoBGN / 365));
        //code ends here
    }
}
