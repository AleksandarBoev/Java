import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        String s = "";


        System.out.println(a);
        //main ends here
    }
}
