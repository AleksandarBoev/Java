import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int n2 = 0;
        int n1 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                n1 = Integer.parseInt(console.nextLine());
                n2 = Integer.parseInt(console.nextLine());
                sum2 = n1 + n2;
            } else {
                n1 = Integer.parseInt(console.nextLine());
                n2 = Integer.parseInt(console.nextLine());
                sum1 = n1 + n2;
            }

            if (i > 0) { //minala e purva i vtora iteraciq
                if (sum1 != sum2) {
                    if (Math.abs(sum1 - sum2) > max) {
                        max = Math.abs(sum1 - sum2);
                    }

                }
            }

        }
        if (max == 0) {
            System.out.println("Yes, value=" + sum2);
        } else {
            System.out.println("No, maxdiff=" + max);
        }

        //code ends here
    }
}
