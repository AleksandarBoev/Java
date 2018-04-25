import java.util.Scanner;

public class P05Stop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int pictureWidth = 2 * (n + 1) + (2 * n) + 1;

        //top part:
        System.out.print(returnStr(n + 1, "."));
        System.out.print(returnStr(2 * n + 1, "_"));
        System.out.println(returnStr(n + 1, "."));
        //top half:
        int topHalfHeight = n;
        for (int row = 0; row < topHalfHeight; row++) {
            System.out.print(returnStr(n - row, "."));
            System.out.print("//");
            System.out.print(returnStr(pictureWidth - 2 * (n - row) - 4, "_"));
            System.out.print("\\\\");
            System.out.println(returnStr(n - row, "."));
        }
        //STOP part:
        System.out.print("//");
        System.out.print(returnStr((pictureWidth - 4 - 5) / 2, "_"));
        System.out.print("STOP!");
        System.out.print(returnStr((pictureWidth - 4 - 5) / 2, "_"));
        System.out.println("\\\\");
        //bottom half:
        int bottomHalfHeight = n;
        for (int row = n; row > 0; row--) {
            System.out.print(returnStr(n - row, "."));
            System.out.print("\\\\");
            System.out.print(returnStr(pictureWidth - 2 * (n - row) - 4, "_"));
            System.out.print("//");
            System.out.println(returnStr(n - row, "."));
        }
        //main ends here
    }

    static private String returnStr(int count, String character) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(character);
        }
        return sb.toString();
    }

}
