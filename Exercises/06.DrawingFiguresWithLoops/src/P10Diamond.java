import java.util.Scanner;

public class P10Diamond {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int toTheLeft = 0;
        int toTheRight = 0;
        int middle = 0;

        //upper half (bigger one)
        int upperHeight = (n + 1) / 2;
        boolean even = n % 2 == 0;

        if (even) {
            toTheLeft = n / 2 - 1;
            toTheRight = n / 2;
        } else {
            toTheLeft = n / 2;
            toTheRight = toTheLeft;
        }
        for (int row = 0; row < upperHeight; row++) {
            for (int col = 0; col < n; col++) {
                if (col == toTheLeft - row || col == toTheRight + row) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }

            }
            System.out.println();
        }
        //lower half (smaller):
        int lowerHeight = (n - 1) / 2;
        toTheLeft = 0;
        toTheRight = n - 1;
        for (int row = 1; row <= lowerHeight ; row++) {
            for (int col = 0; col < n; col++) {
                if (col == toTheLeft + row || col == toTheRight - row) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }


        //main ends here
    }

}