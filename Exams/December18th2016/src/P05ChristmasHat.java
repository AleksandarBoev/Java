import java.util.Scanner;

public class P05ChristmasHat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int pictureLength = 4 * n + 1;

        //top part:
        System.out.println(createStr((pictureLength - 3) / 2, ".") + "/|\\" + createStr((pictureLength - 3) / 2, "."));
        System.out.println(createStr((pictureLength - 3) / 2, ".") + "\\|/" + createStr((pictureLength - 3) / 2, "."));
        //top half:
        int topHalfHeight = 2 * n;
        for (int row = 0; row < topHalfHeight; row++) {
            int numberOfDots = 2 * n - 1 - row;
            System.out.print(createStr(numberOfDots, "."));
            System.out.print("*");
            System.out.print(createStr(row, "-"));
            System.out.print("*");
            System.out.print(createStr(row, "-"));
            System.out.print("*");
            System.out.println(createStr(numberOfDots, "."));
        }
        // bottom part:
        System.out.println(createStr(pictureLength, "*"));
        for (int row = 0; row < pictureLength; row++) {
            if (row % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();
        System.out.println(createStr(pictureLength, "*"));
        //main ends here
    }

    static String createStr(int count, String character) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(character);
        }
        return sb.toString();
    }

}
