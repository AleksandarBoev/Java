package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        LocalDate n = LocalDate.now().plusYears(1);
        for (LocalDate i = LocalDate.now(); i.isBefore(n); i.plusDays(1)) { //bi trqbvalo da otpechata vsichki dati
            System.out.println(i);
        }

        int n1 = Integer.parseInt(console.nextLine());
        for (int i = n1; i >= 1 ; i--) {
            System.out.println(i);
        }

        // write your code here
    }
}
