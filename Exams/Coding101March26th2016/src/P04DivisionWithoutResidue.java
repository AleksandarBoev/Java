import java.util.Scanner;

public class P04DivisionWithoutResidue {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        double percentage1 = 0;
        double percentage2 = 0;
        double percentage3 = 0;
        int number = 0;

        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(console.nextLine());
            if (number % 2 == 0) {
                percentage1++;
            }
            if (number % 3 == 0) {
                percentage2++;
            }
            if (number % 4 == 0) {
                percentage3++;
            }

        }

        percentage1 = percentage1 / n * 100;
        percentage2 = percentage2 / n * 100;
        percentage3 = percentage3 / n * 100;

        System.out.printf("%.2f%%%n", percentage1);
        System.out.printf("%.2f%%%n", percentage2);
        System.out.printf("%.2f%%%n", percentage3);

        //code ends here
    }
}