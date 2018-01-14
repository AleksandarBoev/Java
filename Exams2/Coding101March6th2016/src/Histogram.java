import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        double percentage1 = 0;
        double percentage2 = 0;
        double percentage3 = 0;
        double percentage4 = 0;
        double percentage5 = 0;
        int number = 0;

        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(console.nextLine());
            if (number < 200) {
                percentage1++;
            } else if (number < 400) {
                percentage2++;
            } else if (number < 600) {
                percentage3++;
            } else if (number < 800) {
                percentage4++;
            } else {
                percentage5++;
            }

        }

        percentage1 = percentage1 / n * 100;
        percentage2 = percentage2 / n * 100;
        percentage3 = percentage3 / n * 100;
        percentage4 = percentage4 / n * 100;
        percentage5 = percentage5 / n * 100;

        System.out.printf("%.2f%%%n", percentage1);
        System.out.printf("%.2f%%%n", percentage2);
        System.out.printf("%.2f%%%n", percentage3);
        System.out.printf("%.2f%%%n", percentage4);
        System.out.printf("%.2f%%%n", percentage5);

        //code ends here
    }
}
