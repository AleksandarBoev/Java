import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        //upper half (the bigger one):
//        for (int row = 0; row < n; row++) {
//            for (int col = 0; col < n-1-row; col++) {
//                System.out.print(" ");
//            }
//            for (int col = 0; col < row + 1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//        //lower half (the smaller one):
//        for (int row = 0; row < n; row++) {
//            for (int col = 0; col <= row; col++) {
//                System.out.print(" ");
//            }
//            for (int col = 0; col < n-1-row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //solution 2:
        for (int row = 0; row < n; row++) {
            System.out.print(myMethod(n-1-row, " "));
            System.out.println(myMethod(row+1, "* "));
        }
        for (int row = 0; row < n; row++) {
            System.out.print(myMethod(row+1, " "));
            System.out.println(myMethod(n-1-row, "* "));
        }

        //code ends here
    }

    static String myMethod(int count, String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }
}
