import java.util.Scanner;

public class NumberGenerator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int m = Integer.parseInt(console.nextLine());
        int n = Integer.parseInt(console.nextLine());
        int l = Integer.parseInt(console.nextLine());
        int special = Integer.parseInt(console.nextLine());
        int control = Integer.parseInt(console.nextLine());

        String numberS = ("" + m + n + l);
        int number = Integer.parseInt(numberS);

        for (int i = number; i >= 111; i--) {

            if (i % 3 == 0) {
                special += 5;
            } else if (i % 10 == 5) {
                special -= 2;
            } else if (i % 2 == 0) {
                special *= 2;
            }

            if (special >= control) {
                System.out.printf("Yes! Control number was reached! Current special number is %d.", special);
                return;
            }

        }

        System.out.printf("No! %d is the last reached special number.", special);

        //code ends here
    }
}
