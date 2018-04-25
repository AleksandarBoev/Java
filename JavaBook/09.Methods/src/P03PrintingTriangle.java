import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        printTriangle(n);
        //main ends here
    }

    static void printTriangle(int number) {
        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        for (int row = number - 1; row >= 0; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
