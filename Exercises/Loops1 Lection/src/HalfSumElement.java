import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int max = Integer.parseInt(console.nextLine());
        int number = 0;
        int sum = max;

        for (int i = 0; i < n-1; i++) {
            number = Integer.parseInt(console.nextLine());
            if (number > max) {
                max = number;
            }
            sum += number;

        }

        if (sum - max == max) {
            System.out.printf("Yes sum = %d", max);
        } else {
            int difference = Math.abs(max - (Math.abs(max - sum)));
            System.out.printf("No Diff = %d", difference);
        }

        //code ends here
    }
}
