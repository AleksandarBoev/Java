package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
                Thread.sleep(333);
            }
            System.out.println("");
        }


	// write your code here
    }
}
