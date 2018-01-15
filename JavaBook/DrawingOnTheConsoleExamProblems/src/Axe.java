import java.util.Scanner;

public class Axe {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int pictureWidth = 5 * n;
        //top half (without handle):
        int untilHandle = n; //vertical
        int untilBlade = 3 * n; //horizontal
        int topPartBlade = untilBlade;

        for (int row = 0; row < untilHandle; row++) {
            System.out.print(buildString(untilBlade, "-"));
            System.out.print("*");
            for (int col = untilBlade; col < pictureWidth - 1; col++) {
                if (col == topPartBlade + row) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        //handle part:
        int handleHight = n / 2; // 5 => 2, 8 => 4
        for (int row = 0; row < handleHight; row++) {
            System.out.print(buildString(untilBlade + 1, "*"));
            System.out.print(buildString(n - 1, "-"));
            System.out.print("*");
            System.out.println(buildString(pictureWidth - untilBlade + 1 - n - 2, "-")); //pictureWidth - duljinata na vsichko printirano dosega
        }

        //bottom part:
        int botHeight = n / 2;
        int middleBladePart = n - 1;
        for (int row = 0; row < botHeight; row++) {
            System.out.print(buildString(untilBlade - row, "-"));
            System.out.print("*");
            if (row != botHeight - 1) {
                System.out.print(buildString(middleBladePart + 2 * row, "-"));
            } else {
                System.out.print(buildString(middleBladePart + 2 * row, "*"));
            }
            System.out.print("*");
            System.out.println(buildString(pictureWidth - (untilBlade - row) - 1 - (middleBladePart + 2 * row) - 1, "-"));
        }

        //main ends here
    }

    static String buildString (int count, String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }

}
