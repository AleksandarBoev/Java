import java.util.Scanner;

public class P04SumNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int sum = 0;
        int temporary = 0;

        for (int i = 1; i <= n ; i++) {
            temporary = Integer.parseInt(console.nextLine());
            sum += temporary;

        }

        System.out.println(sum);

        //code ends here
    }
}