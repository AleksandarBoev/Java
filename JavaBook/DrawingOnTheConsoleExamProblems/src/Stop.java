import java.util.Scanner;

public class Stop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int width = 0;
        if (n > 3) {
            width = (n * 5) - (n - 3);
        } else if (n == 3) {
            width = 3;
        }
        //just top part:
        int justTopPart = n * 2 + 1;
        System.out.println(buildString(n + 1, ".") + buildString(justTopPart, "_") + buildString(n + 1, "."));
        //top part (smaller):
        int topHeight = n;
        int backGround = n;
        int middlePart = 2 * n - 1;
        int middlePartCopy = middlePart;
        for (int row = 0; row < n; row++) {
            System.out.print(buildString(n - row, "."));
            System.out.print("//");
            middlePart = middlePartCopy + row * 2;
            System.out.print(buildString(middlePart, "_"));
            System.out.print("\\\\");
            System.out.println(buildString(n - row, "."));
        }
        //stop:
        middlePartCopy = middlePart + 2;
        System.out.print("//");
        middlePart = (middlePart - 3) / 2;
        System.out.print(buildString(middlePart, "_"));
        System.out.print("STOP!");
        System.out.print(buildString(middlePart, "_"));
        System.out.println("\\\\");
        //bottom part:
        for (int row = 0; row < n; row++) {
            System.out.print(buildString(row, "."));
            System.out.print("\\\\");
            middlePart = middlePartCopy + row * 2;
            System.out.print(buildString(middlePartCopy - 2 * row, "_"));
            System.out.print("//");
            System.out.println(buildString(row, "."));
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
