import java.util.Scanner;

public class MinMethod {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n1 = Integer.parseInt(console.nextLine());
        int n2 = Integer.parseInt(console.nextLine());
        int n3 = Integer.parseInt(console.nextLine());
        System.out.println(getMin(getMin(n1, n2), n3));


        //main ends here
    }

    static int getMin(int num1, int num2) {
        if (num1 <= num2) {
            return num1;
        } else {
            return num2;
        }

    }

}
