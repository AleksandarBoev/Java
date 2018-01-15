import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int f1 = 1;
        int f2 = 1;
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n - 1; i++) {
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        System.out.println(f2);

        //main ends here
    }
}
