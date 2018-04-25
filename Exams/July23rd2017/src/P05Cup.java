import java.util.Scanner;

public class P05Cup {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int pictureLength = 5 * n;

        //top part
        int topPartHeight = n / 2;
        for (int row = 0; row < topPartHeight; row++) {
            System.out.print(createStr(n + row, "."));
            System.out.print(createStr(pictureLength - 2 * (n + row), "#"));
            System.out.println(createStr(n + row, "."));
        }
        //middle part:
        int middlePartHeight = n - (n - (n / 2) - 2);
        int start = topPartHeight + 1;
        for (int row = start; row <= pictureLength + start; row++) {
            System.out.print(createStr(n + row, "."));
            System.out.print("#");
            if (row != middlePartHeight + start) {

            }
        }
        //main ends here
    }

    static String createStr(int count, String character) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(character);
        }
        return sb.toString();
    }

}
