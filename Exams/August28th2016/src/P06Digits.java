import java.text.DecimalFormat;
import java.util.Scanner;

public class P06Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int dissect = number;

        int n3 = dissect % 10; //treta cifra (ako number e 123 -> n3 = 3)
        dissect /= 10;
        int n2 = dissect % 10; //vtora
        dissect /= 10;
        int n1 = dissect % 10; // purva
//        dissect = number;

        int lines  = n1 + n2; //redove
        int columns = n1 + n3; //koloni

        int n = lines * columns;

        for (int i = 0; i <= n-1; i++) {
            if (i % columns == 0) {
                System.out.println();
            }

            if (number % 5 == 0) {
                number -= n1;
//                System.out.print(number);
            } else if (number % 3 == 0) {
                number -= n2;
//                System.out.print(number);
            } else {
                number += n3;
            }
            System.out.print(number);
            if (!((i + 1) % columns == 0)) {
                System.out.print(" ");
            }

        }



        //code ends here
    }
}
