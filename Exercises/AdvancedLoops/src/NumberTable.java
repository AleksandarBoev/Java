import java.text.DecimalFormat;
import java.util.Scanner;

public class NumberTable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int col = 0;

        for (int row = 1; row <= n; row++) {
            for (col = row; col <= n; col++) {
                System.out.print(col + " ");
            }
            if (col - 1 == n) { //col - 1 zashtoto col == n + 1 i zatova gorniq cikul e sprql da se vurti
                for (col = n - 1; col > n - row ; col--) {
                    System.out.print(col + " ");
                }
            }
            System.out.println();
        }

        //main ends here
    }
}
