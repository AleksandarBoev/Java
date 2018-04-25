import java.util.Scanner;

public class P09PerfectDiamond {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int pictureLength = 2 * n - 1;
        //top half + middle part:
        int topHalfHeight = n;
        for (int row = 0; row < topHalfHeight; row++) {
            int diamondFill = 2 * row + 1;
            for (int col = 0; col < (pictureLength - diamondFill) / 2; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print(col % 2 == 0 ? "*" : "-");
            }
            System.out.println();
        }
        //bottom half:
        int bottomHalfHeight = topHalfHeight - 1;
        for (int row = bottomHalfHeight - 1; row >= 0; row--) {
            int diamondFill = 2 * row + 1;
            for (int col = 0; col < (pictureLength - diamondFill) / 2; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print(col % 2 == 0 ? "*" : "-");
            }
            System.out.println();
        }

        //main ends here
    }
}
