import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int middleFrame = (n + 1) / 2; // (4 + 1) / 2 = 2, (5 + 1) / 2 = 3
        int middleGap = n;
        int glassWidth = 2 * n;
        int glassHeight = n;
        //upper part:
        for (int row = 0; row < glassWidth; row++) {
            System.out.print("*");
        }
        for (int row = 0; row < middleGap; row++) {
            System.out.print(" ");
        }
        for (int row = 0; row < glassWidth; row++) {
            System.out.print("*");
        }
        System.out.println();
        //middle part:
        for (int row = 0; row < glassHeight - 2; row++) {
            System.out.print("*");
            for (int col = 0; col < glassWidth - 2; col++) {
                System.out.print("/");
            }
            System.out.print("*");
            if (row == middleFrame - 2) {
                for (int col = 0; col < middleGap; col++) {
                    System.out.print("|");
                }
            } else {
                for (int col = 0; col < middleGap; col++) {
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            for (int col = 0; col < glassWidth - 2; col++) {
                System.out.print("/");
            }
            System.out.println("*");
        }
        //lower part:
        for (int row = 0; row < glassWidth; row++) {
            System.out.print("*");
        }
        for (int row = 0; row < middleGap; row++) {
            System.out.print(" ");
        }
        for (int row = 0; row < glassWidth; row++) {
            System.out.print("*");
        }
        System.out.println();

        //code ends here
    }

    static String buildString (int count, String text) {
        StringBuilder fast = new StringBuilder();
        for (int i = 0; i < count; i++) {
            fast.append(text);
        }
        return fast.toString();
    }
}