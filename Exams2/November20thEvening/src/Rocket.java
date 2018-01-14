import java.util.Scanner;

public class Rocket {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int rocketWidth = 3 * n;

        //rocket tip part:
        int tipHeight = n;
        int leftBorder = 3 * n / 2;
        int rightBorder = 3 * n / 2 + 1;
        for (int row = 0; row < tipHeight; row++) {
            System.out.print(returnStr(leftBorder - row - 1, "."));
            System.out.print("/");
            System.out.print(returnStr(row * 2, " "));
            System.out.print("\\");
            System.out.println(returnStr(rocketWidth - (leftBorder - row - 1) - 1 - 2 * row - 1, "."));
        }
        //separator
        System.out.print(returnStr(n / 2, "."));
        System.out.print(returnStr(n * 2, "*"));
        System.out.println(returnStr(n / 2, "."));
        //rocket body
        int bodyHeight = 2 * n;
        for (int row = 0; row < bodyHeight; row++) {
            System.out.print(returnStr(n / 2, "."));
            System.out.print("|");
            System.out.print(returnStr(n * 2 - 2, "\\"));
            System.out.print("|");
            System.out.println(returnStr(n / 2, "."));
        }
        //bottom part
        int botHeight = n / 2;
        for (int row = 0; row < botHeight; row++) {
            System.out.print(returnStr(n / 2 - row, "."));
            System.out.print("/");
            System.out.print(returnStr(rocketWidth - 2 - n + 2 * row, "*"));
            System.out.print("\\");
            System.out.println(returnStr(n / 2 - row, "."));
        }

        //main ends here
    }

    static String returnStr(int count, String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }

}
