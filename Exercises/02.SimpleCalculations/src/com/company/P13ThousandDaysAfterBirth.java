package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class P13ThousandDaysAfterBirth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a date in the format dd-MM-yyyy");
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate = scanner.nextLine();
        LocalDate daysLater = LocalDate.parse(myDate, myFormat);
        daysLater = daysLater.plusDays(999);
        System.out.println(myFormat.format(daysLater));
    }
}
