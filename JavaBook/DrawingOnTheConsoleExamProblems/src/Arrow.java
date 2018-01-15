import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine()); //nechetno chislo

        int pictureWidth = n * 2 - 1;
        //first row:
        System.out.print(returnStr(n / 2, "."));
        System.out.print(returnStr(n, "#"));
        System.out.println(returnStr(n / 2, "."));
        //top half:
        int topHalfHeight = n - 2;
        for (int row = 0; row < topHalfHeight; row++) {
            System.out.print(returnStr(n / 2, "."));
            System.out.print("#");
            System.out.print(returnStr(pictureWidth - n / 2 - n / 2 - 2, "."));
            System.out.print("#");
            System.out.println(returnStr(n / 2, "."));
        }
        //middle row:
        System.out.print(returnStr(n / 2 + 1, "#"));
        System.out.print(returnStr(pictureWidth - n / 2 - n / 2 - 2, "."));
        System.out.println(returnStr(n / 2 + 1, "#"));
        //bottom half:
        int botHalfHeight = n - 1;
        for (int row = 1; row <= botHalfHeight; row++) {
            System.out.print(returnStr(row, "."));
            System.out.print("#");
            System.out.print(returnStr(pictureWidth - 2 - row * 2, "."));
            if (row != botHalfHeight) {
                System.out.print("#");
            }
            System.out.println(returnStr(row, "."));
        }
        //main ends here
    }

    static String returnStr (int count, String character) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(character);
        }
        return sb.toString();
    }

}
