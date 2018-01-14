import java.util.Scanner;

public class StopNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int m = Integer.parseInt(console.nextLine());
        int s = Integer.parseInt(console.nextLine());

        for (int i = m; i >= n ; i--) {
            if (i % 2 == 0 && i % 3 == 0) {
                if (i != s) {
                    System.out.print(i + " ");
                } else {
                    break;
                }
            }
        }
        //main ends here
    }
}