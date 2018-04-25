import java.util.Scanner;

public class P04DrawAFilledSquare {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        printSquare(n);


        //main ends here
    }

    static void printSquare(int number) {
        for (int col = 0; col < number * 2; col++) {
            System.out.print("-");
        }
        System.out.println();
        for (int row = 0; row < number - 2; row++) {
            System.out.print("-");
            for (int col = 0; col < number * 2 - 2; col++) {
                if (col % 2 == 0) {
                    System.out.print("\\");
                } else {
                    System.out.print("/");
                }
            }
            System.out.println("-");
        }
        for (int col = 0; col < number * 2; col++) {
            System.out.print("-");
        }
    }

}
