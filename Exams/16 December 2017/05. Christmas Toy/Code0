import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine()); //vinagi shte e chetno, celochisleno delenie nqma da e problem
        int pictureLength = 5 * n;

        //top part:
        System.out.print(createStr((pictureLength - n) / 2, "-"));
        System.out.print(createStr(n, "*"));
        System.out.println(createStr((pictureLength - n) / 2, "-"));
        //top upper half:
        int numberOfMinuses2 = 0;
        int topUpperHalfHeight = n / 2;
        for (int row = 1; row <= topUpperHalfHeight; row++) {
            int numberOfAnds = n + 2 * row;
            int numberOfMinuses = pictureLength - 2 * row - numberOfAnds;
            numberOfMinuses /= 2;

            System.out.print(createStr(numberOfMinuses, "-"));
            System.out.print(createStr(row, "*"));
            System.out.print(createStr(numberOfAnds, "&"));
            System.out.print(createStr(row, "*"));
            System.out.println(createStr(numberOfMinuses, "-"));

            if (row == topUpperHalfHeight) {
                numberOfMinuses2 = numberOfMinuses - 1;
            }
        }
        //top lower half:
        int topLowerHalfHeight = topUpperHalfHeight;
        for (int row = 0; row < topLowerHalfHeight; row++) {
            int numberOfCurlyMinuses = pictureLength - (numberOfMinuses2 - row) * 2 - 4;

            System.out.print(createStr(numberOfMinuses2 - row, "-"));
            System.out.print("**");
            System.out.print(createStr(numberOfCurlyMinuses, "~"));
            System.out.print("**");
            System.out.println(createStr(numberOfMinuses2 - row, "-"));
        }
        //middle part:
        System.out.print(createStr(n / 2, "-"));
        System.out.print("*");
        System.out.print(createStr(pictureLength - n - 2, "|"));
        System.out.print("*");
        System.out.println(createStr(n / 2, "-"));
        //mirror top lower half:
        for (int row = topLowerHalfHeight - 1; row >= 0; row--) {
            int numberOfCurlyMinuses = pictureLength - (numberOfMinuses2 - row) * 2 - 4;

            System.out.print(createStr(numberOfMinuses2 - row, "-"));
            System.out.print("**");
            System.out.print(createStr(numberOfCurlyMinuses, "~"));
            System.out.print("**");
            System.out.println(createStr(numberOfMinuses2 - row, "-"));
        }
        //mirror top upperHalf:
        for (int row = topUpperHalfHeight; row > 0; row--) {
            int numberOfAnds = n + 2 * row;
            int numberOfMinuses = pictureLength - 2 * row - numberOfAnds;
            numberOfMinuses /= 2;

            System.out.print(createStr(numberOfMinuses, "-"));
            System.out.print(createStr(row, "*"));
            System.out.print(createStr(numberOfAnds, "&"));
            System.out.print(createStr(row, "*"));
            System.out.println(createStr(numberOfMinuses, "-"));

            if (row == topUpperHalfHeight) {
                numberOfMinuses2 = numberOfMinuses - 1;
            }
        }
        //mirror top part:
        System.out.print(createStr((pictureLength - n) / 2, "-"));
        System.out.print(createStr(n, "*"));
        System.out.println(createStr((pictureLength - n) / 2, "-"));

//        main ends here
    }

    static String createStr(int count, String character) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(character);
        }
        return sb.toString();
    }

}
