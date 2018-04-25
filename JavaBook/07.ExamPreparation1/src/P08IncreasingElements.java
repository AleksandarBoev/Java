import java.util.Scanner;

public class P08IncreasingElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int maxCount = 1;
        int count = 0;
        int lastNumber = Integer.MIN_VALUE;
        boolean atLeastOnce = false;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(console.nextLine());
            if (number > lastNumber) {
                atLeastOnce = true;
                count ++;
            } else {
                count = 1; //todo hello how r u
            }
            maxCount = Math.max(count, maxCount);
            lastNumber = number;
        }
        if (atLeastOnce) {
            System.out.println(Math.max(count, maxCount));
        } else {
            System.out.println(0);
        }

        //main ends here
    }
}
