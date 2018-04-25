package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 1;
        System.out.println(++a); // първо добавя, после се извършва действие
        System.out.println(a);
        System.out.println(a++); // първо се извършва действие, после се добавя едно
        System.out.println(a);

        int i;
        for (i = 1 ; i<= 10; i++) { // може и математически израз да бъде сложен вместо (i++)
            System.out.println(i);

        }
        System.out.println(i);
        int n = 1;
        for (i =1; n <= 10; i++) {
            n+=i;
            System.out.println(n);
        }



	// write your code here
    }
}
