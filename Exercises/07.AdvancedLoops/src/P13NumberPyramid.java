import java.util.Scanner;

public class P13NumberPyramid {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
//        while
        int n = Integer.parseInt(console.nextLine());
        int count = 0;
        boolean stop = false;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(++count + " ");
                if (count == n) {
                    stop = true;
                    break;
                }
            }
            if (stop) {
                break;
            } else {
                System.out.println();
            }
        }
        //main ends here
    }
}
