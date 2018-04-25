import java.util.Scanner;

public class P10RectangleWithStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int pictureHeight = n % 2 == 0 ? n + 1 : n + 2;
        int pictureLength = 2 * n;
        int rowWithStars = (int) Math.ceil(pictureHeight / 2.0);

        for (int row = 1; row <= pictureHeight; row++) {
            if (row == 1 || row == pictureHeight) {
                System.out.println(returnStr(pictureLength, '%'));
                continue;
            }
            if (row == rowWithStars) {
                System.out.print("%");
                System.out.print(returnStr((pictureLength - 4) / 2, ' '));
                System.out.print("**");
                System.out.print(returnStr((pictureLength - 4) / 2, ' '));
                System.out.println("%");
                continue;
            }
            System.out.printf("%c%s%c%n", '%', returnStr(pictureLength - 2, ' '), '%');
        }

        //main ends here
    }

    static String returnStr(int count, char character){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(character);
        }
        return sb.toString();
    }

}
