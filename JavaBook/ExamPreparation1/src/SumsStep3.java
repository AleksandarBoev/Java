import java.util.Scanner;

public class SumsStep3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());


        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 1; i <= n ; i++) {
            int number = Integer.parseInt(console.nextLine());
            if (i % 3 == 1) {
                sum1 += number;
            } else if (i % 3 == 2) {
                sum2 += number;
            } else if (i % 3 == 0) {
                sum3 += number;
            }
        }
        System.out.printf("sum1 = %d%n", sum1);
        System.out.printf("sum2 = %d%n", sum2);
        System.out.printf("sum3 = %d", sum3);

        //main ends here
    }
}
