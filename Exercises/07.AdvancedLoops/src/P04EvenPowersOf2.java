import java.util.Scanner;

public class P04EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int i = 0;
        while (i <= n) {
            System.out.println((long)Math.pow(2, i));
            i+=2;
        }

        //main ends here
    }
}