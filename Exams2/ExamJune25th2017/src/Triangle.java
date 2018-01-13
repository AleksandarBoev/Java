import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int triangleHeight = 2 * n + 1;
        int triangleLength = 4 * n + 1;

        //top part:
        System.out.println(returnStr(triangleLength, "#"));
        //top half (without top part):
        int topHalfHeight = n;
        int rowWithEye = n / 2 + 1;
        int firstHashTagsNumber = 2 * n - 1;
        for (int row = 1; row <= n; row++) {
            System.out.print(returnStr(row, "."));
            int stupidNumber = firstHashTagsNumber - (2 * (row - 1));
            System.out.print(returnStr(stupidNumber, "#"));
            if (row != rowWithEye) {
                System.out.print(returnStr(triangleLength - 2 * row - 2 * stupidNumber, " "));
            } else {
                int stupidNumber2 = triangleLength - 2 * row - 2 * stupidNumber;
                System.out.print(returnStr((stupidNumber2 - 3) / 2, " "));
                System.out.print("(@)");
                System.out.print(returnStr((stupidNumber2 - 3) / 2, " "));
            }
            System.out.print(returnStr(stupidNumber, "#"));
            System.out.println(returnStr(row, "."));
        }
        //bottom half:
        int bottomHalfHeight = n;
        for (int row = 1; row <= n; row++) {
            System.out.print(returnStr(n + row, "."));
            System.out.print(returnStr(triangleLength - 2 * (n + row), "#"));
            System.out.println(returnStr(n + row, "."));
        }



        //main ends here
    }

    static public String returnStr(int count, String character) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(character);
        }
        return sb.toString();
    }

}
