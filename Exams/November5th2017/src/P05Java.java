import java.util.Scanner;

public class P05Java {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int pictureLength = 3 * n + 6;

        //top part (steam)
        for (int row = 0; row < n; row++) {
            System.out.print(returnStr(n, " "));
            System.out.println("~ ~ ~");
        }
        //above java
        System.out.println(returnStr(pictureLength - 1, "="));
        //middle part
        int middleHeight = n - 2;
        int javaRow = n / 2;
        for (int row = 1; row <= middleHeight; row++) {
            System.out.print("|");
            System.out.print(returnStr(n, "~"));

            if (row != javaRow) {
                System.out.print(returnStr(4, "~"));
            } else {
                System.out.print("JAVA");
            }

            System.out.print(returnStr(n, "~"));
            System.out.print("|");
            System.out.print(returnStr(n - 1, " "));
            System.out.println("|");
        }
        //below java
        System.out.println(returnStr(pictureLength - 1, "="));
        //bottom half
        int bottomHalfHeight = n;
        for (int row = 0; row < n; row++) {
            System.out.print(returnStr(row, " "));
            System.out.print("\\");
            System.out.print(returnStr((2 * n + 4) - 2 * row, "@"));
            System.out.println("/");
        }
        //bottom part
        System.out.print(returnStr(2 * n + 4 + 2, "="));
        //main ends here
    }

    static String returnStr(int count, String character) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(character);
        }
        return sb.toString();
    }

}