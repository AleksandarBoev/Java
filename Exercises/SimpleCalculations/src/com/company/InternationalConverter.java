package com.company;

import java.util.Scanner;

public class InternationalConverter {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double amount = Double.parseDouble(myScanner.nextLine());
        String currency1 = myScanner.nextLine();
        String currency2 = myScanner.nextLine();
        double leva = 0, result = 0;
        if (currency1.equals("BGN")) {
            leva = amount;
        } else {
            if (currency1.equals("USD")) {
                leva = amount * 1.79549;
            } else if (currency1.equals("EUR")) {
                leva = amount * 1.95583;
            } else if (currency1.equals("GBP")) {
                leva = amount * 2.53405;
            }
        }

        if (currency2.equals("BGN")) {
            result = leva;
        } else {
            if (currency2.equals("USD")) {
                result = leva / 1.79549;
            } else if (currency2.equals("EUR")) {
                result = leva / 1.95583;
            } else if (currency2.equals("GBP")) {
                result = leva / 2.53405;
            }
        }
        System.out.printf("%.2f %s", result, currency2);
        //code ends here
    }
}
