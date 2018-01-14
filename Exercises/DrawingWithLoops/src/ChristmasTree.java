import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

//        for (int row = 0; row < n + 1; row++) {
//            for (int col = 0; col < n - row; col++) {
//                System.out.print(" ");
//            }
//            for (int col = 0; col < row; col++) {
//                System.out.print("*");
//            }
//            System.out.print(" | ");
//            for (int col = 0; col < row; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //solution 2:
        for (int row = 0; row < n + 1; row++) {
            System.out.print(myMethod2(n - row, " "));
            System.out.print(myMethod2(row, "*"));
            System.out.print(" | ");
            System.out.println(myMethod2(row, "*"));
        }

        //code ends here
    }
    static String myMethod2 (int count, String text) {
        StringBuilder myStr = new StringBuilder();
        for (int i = 0; i < count; i++) {
            myStr.append(text);
        }
        return myStr.toString();
    }

}
