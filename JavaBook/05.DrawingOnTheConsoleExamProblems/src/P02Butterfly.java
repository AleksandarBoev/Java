import java.util.Scanner;

public class P02Butterfly {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int butterflyWidth = 2 * n - 1;
        int butterflyHeight = 2 * (n - 2) + 1;
        int leftWing = n-1;
        int rightWing = leftWing;

        //top wings:
        for (int rows = 0; rows < butterflyHeight / 2; rows++) {
            if (rows % 2 == 0) {
                System.out.println(wings(butterflyWidth, "*", "\\", "/"));
            } else {
                System.out.println(wings(butterflyWidth, "-", "\\", "/"));
            }
        }
        //middle part
        for (int i = 0; i < butterflyWidth; i++) {
            if (i != n - 1) {
                System.out.print(" ");
            } else {
                System.out.print("@");
            }
        }
        System.out.println();
        //bottom wongs:
        for (int rows = 0; rows < butterflyHeight / 2; rows++) {
            if (rows % 2 == 0) {
                System.out.println(wings(butterflyWidth, "*", "/", "\\"));
            } else {
                System.out.println(wings(butterflyWidth, "-", "/", "\\"));
            }
        }
        //main ends here
    }

    static String wings (int count, String fill, String leftSymbol, String rightSymbol) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count / 2 - 1; i++) {
            sb.append(fill);
        }
        sb.append(leftSymbol);
        sb.append(" ");
        sb.append(rightSymbol);
        for (int i = 0; i < count / 2 - 1; i++) {
            sb.append(fill);
        }
        return sb.toString();
    }

}
