import java.util.Scanner;

public class P05Diamond {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int pictureWidth = 5 * n;
        int pictureHeight = 3 * n + 2;
        //upper half + mid
        int upperHalfHeight = n + 1;
        for (int row = 0; row < upperHalfHeight - 1; row++) {
            System.out.print(returnStr(n - row, "."));
            System.out.print("*");
            if (row != 0) {
                System.out.print(returnStr(pictureWidth - (n - row) * 2 - 2, "."));
            } else {
                System.out.print(returnStr(pictureWidth - (n - row) * 2 - 2, "*"));
            }
            System.out.print("*");
            System.out.println(returnStr(n - row, "."));
        }
        //mid part:
        System.out.println(returnStr(pictureWidth, "*"));
        //bottom half:
        int bottomHeight = pictureHeight - upperHalfHeight;
        for (int row = 1; row <= bottomHeight; row++) {
            System.out.print(returnStr(row, "."));
            System.out.print("*");
            if (row != bottomHeight) {
                System.out.print(returnStr(pictureWidth - row * 2 - 2, "."));
            } else {
                System.out.print(returnStr(pictureWidth - row * 2 - 2, "*"));
            }
            System.out.print("*");
            System.out.println(returnStr(row, "."));
        }

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