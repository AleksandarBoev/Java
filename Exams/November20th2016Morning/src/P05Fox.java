import java.util.Scanner;

public class P05Fox {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine()); //odd numbah
        int pictureWidth = 2 * n + 3;
        //ears:
        int earsHeight = n;
        for (int row = 1; row <= earsHeight ; row++) {
            System.out.print(returnStr(row, "*"));
            System.out.print("\\");
            System.out.print(returnStr(pictureWidth - 2 * row - 2, "-"));
            System.out.print("/");
            System.out.println(returnStr(row, "*"));
        }

        //eyes:
//        int eyesHeight = (n / 2 / 2) + 1;
        int eyesHeight = n / 3;
        int eyeWidth = n / 2;
        for (int row = 0; row < eyesHeight; row++) {
            System.out.print("|");
            System.out.print(returnStr(eyeWidth + row, "*"));
            System.out.print("\\");
            System.out.print(returnStr(pictureWidth - 2 - (eyeWidth + row) * 2 - 2, "*")); //or n - (2 * row)
            System.out.print("/");
            System.out.print(returnStr(eyeWidth + row, "*"));
            System.out.println("|");
        }
        //mouth:
        int mouthHeight = n;
        for (int row = 1; row <= mouthHeight; row++) {
            System.out.print(returnStr(row, "-"));
            System.out.print("\\");
            System.out.print(returnStr(pictureWidth - 2 - (2 * row), "*"));
            System.out.print("/");
            System.out.println(returnStr(row, "-"));
        }
        //main ends here
    }

    static String returnStr (int count, String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }

}
