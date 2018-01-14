import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int sumEven = 0;
        int sumOdd = 0;
        int temporary = 0;

        for (int i = 1; i <= n ; i++) {
            temporary = Integer.parseInt(console.nextLine());
            if (i % 2 == 0) {
                sumEven += temporary;
            } else {
                sumOdd += temporary;
            }

        }

        if (sumOdd == sumEven) {
            System.out.printf("Yes sum = %d", sumEven);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumEven - sumOdd));
        }

        //code ends here
    }
}