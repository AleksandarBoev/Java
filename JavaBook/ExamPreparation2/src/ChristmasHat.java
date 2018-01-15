import java.util.Scanner;

public class ChristmasHat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int pictureLength = 4 * n + 1;

        //top part:
        System.out.print(returnStr((pictureLength - 3) / 2, '.'));
        System.out.print("/|\\");
        System.out.println(returnStr((pictureLength - 3) / 2, '.'));

        System.out.print(returnStr((pictureLength - 3) / 2, '.'));
        System.out.print("\\|/");
        System.out.println(returnStr((pictureLength - 3) / 2, '.'));

        //top half:
        int topHalfHeight = 2 * n;
        for (int row = 0; row < topHalfHeight; row++) {
            System.out.print(returnStr((pictureLength - 3) / 2 - row, '.'));
            System.out.print("*");
            System.out.print(returnStr(row, '-'));
            System.out.print("*");
            System.out.print(returnStr(row, '-'));
            System.out.print("*");
            System.out.println(returnStr((pictureLength - 3) / 2 - row, '.'));
        }

        //bottom part:
        System.out.println(returnStr(pictureLength, '*'));
        for (int i = 0; i < pictureLength; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();
        System.out.println(returnStr(pictureLength, '*'));

        //main ends here
    }

    static String returnStr(int count, char character) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(character);
        }
        return sb.toString();
    }

}
