import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int sum = 0;
        int sum1 = 0;
        int temporary = 0;

        for (int i = 1; i <= n ; i++) {
            temporary = Integer.parseInt(console.nextLine());
            sum += temporary;

        }

        for (int i = 1; i <= n ; i++) {
            temporary = Integer.parseInt(console.nextLine());
            sum1 += temporary;

        }

        if (sum1 == sum) {
            System.out.printf("Yes, sum = %d", sum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sum - sum1));
        }

        //code ends here
    }
}