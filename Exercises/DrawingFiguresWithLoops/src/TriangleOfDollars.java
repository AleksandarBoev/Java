import java.util.Scanner;

public class TriangleOfDollars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row - 1; col++) {
                System.out.print("$ ");
            }
            System.out.println("$");
        }

        //code ends here
    }
}